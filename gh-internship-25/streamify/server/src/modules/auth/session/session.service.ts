import { Injectable, NotFoundException, UnauthorizedException } from '@nestjs/common'
import { PrismaService } from '@/core/prisma/prisma.service'
import { ConfigService } from '@nestjs/config'
//import { verify } from 'argon2'
import * as bcrypt from 'bcrypt'
//import type { Request } from 'express'
import type { Request } from 'express-session'

import { LoginInput } from './inputs/login.input'
import { saveSession, destroySession } from '@/shared/utils/session.util'
import { UserModel } from '@/modules/auth/account/models/user.model'
import type { User } from '@/prisma/generated'
import { getSessionMetadata } from '@/shared/utils/session-metadata.util'
import { RedisService } from '@/core/redis/redis.service' //added this
import type { SessionData } from 'express-session'
import { ConflictException } from '@nestjs/common'

@Injectable()
export class SessionService {
  constructor(
    private readonly prisma: PrismaService,
    private readonly configService: ConfigService,
    private readonly redisService: RedisService //added this
  ) {}

  //changed <UserModel> to <User>
  async login(req: Request, input: LoginInput, userAgent: string): Promise<User> {
    const { login, password } = input

    // Find user by username or email
    const user = await this.prisma.user.findFirst({
      where: {
        OR: [
          { email: login.toLowerCase() },
          { username: login.toLowerCase() },
        ]
      }
    })

    if (!user) {
      throw new NotFoundException('Пользователь не найден')
    }

    // Validate password
    //const isValid = await verify(user.password, password)
    const isValid = await bcrypt.compare(password, user.password)
    if (!isValid) {
      throw new UnauthorizedException('Неверный пароль')
    }

    const metadata = getSessionMetadata(req, userAgent)

    // Save session
    await saveSession(req, user, metadata)

    return user

    //return saveSession(req, user, metadata)
  }

  async logout(req: Request): Promise<boolean> {
    return destroySession(req, this.configService) as Promise<boolean>
  }

  public async findByUser(req: Request): Promise<any[]> {
    const userId = req.session.userId
    if (!userId) throw new NotFoundException('User not found')
  
    const keys = await this.redisService.keys('*')
  
    //const userSessions = []
    const userSessions: (SessionData & { id: string })[] = []
  
    for (const key of keys) {
      const sessionData = await this.redisService.get(key)
      if (sessionData) {
        const session = JSON.parse(sessionData)
        if (session.userId === userId) {
          userSessions.push({
            ...session,
            id: key.split(':')[1]
          })
        }
      }
    }
  
    //userSessions.sort((a, b) => b.createdAt - a.createdAt)
    userSessions.sort((a, b) => new Date(b.createdAt).getTime() - new Date(a.createdAt).getTime())

  
    return userSessions.filter(session => session.id !== req.session.id)
  }

  public async findCurrent(req: Request) {
    const sessionId = req.session.id
    const data = await this.redisService.get(`${this.configService.getOrThrow('SESSION_FOLDER')}${sessionId}`)

    if (!data) {
      throw new NotFoundException('Session not found')
    }
  
  
    return {
      ...JSON.parse(data),
      id: sessionId
    }
  }

  public async clearSession(req: Request) {
    req.res.clearCookie(this.configService.getOrThrow('SESSION_NAME'))
    return true
  }

  public async remove(req: Request, id: string) {
    if (req.session.id === id) {
      throw new ConflictException('Cannot delete current session')
    }
  
    await this.redisService.del(
      `${this.configService.getOrThrow('SESSION_FOLDER')}${id}`
    )
  
    return true
  }


}
