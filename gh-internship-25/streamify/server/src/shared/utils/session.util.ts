// Define saveSession(req, user) to save userId and createdAt to req.session
import { InternalServerErrorException } from '@nestjs/common'
import { ConfigService } from '@nestjs/config'
import type { Request } from 'express-session' //was just express
//import './shared/types/express-session'
import 'express-session'

import type { User } from '@/prisma/generated'
import type { SessionMetadata } from '@/shared/types/session-metadata.types'

export function saveSession(
	req: Request,
	user: User,
	metadata: SessionMetadata
) {
	return new Promise((resolve, reject) => {
		req.session.createdAt = new Date()
		req.session.userId = user.id
		req.session.metadata = metadata

		req.session.save(err => {
			if (err) {
				return reject(
					new InternalServerErrorException(
						'Не удалось сохранить сессию'
					)
				)
			}

			resolve({ user })
		})
	})
}


// Define destroySession(req, configService) to destroy session and clear cookie
export function destroySession(req: Request, configService: ConfigService) {
	return new Promise((resolve, reject) => {
		req.session.destroy(err => {
			if (err) {
				return reject(
					new InternalServerErrorException(
						'Не удалось завершить сессию'
					)
				)
			}

			//add ?
            req.res?.clearCookie(
				configService.getOrThrow<string>('SESSION_NAME')
			)

			resolve(true)
		})
	})
}