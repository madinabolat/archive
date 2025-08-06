import {
  Args,
  Context,
  Mutation,
  Resolver,
  Query
} from '@nestjs/graphql'
import { SessionService } from './session.service'
import { LoginInput } from './inputs/login.input'
import { UserModel } from '@/modules/auth/account/models/user.model'
import { GqlContext } from '@/shared/types/gql-context.types'
import { UserAgent } from '@/shared/decorators/user-agent.decorator'
import { SessionModel } from './session.model'

import { Authorization } from '@/shared/decorators/auth.decorator'

@Resolver('Session')
export class SessionResolver {
  constructor(private readonly sessionService: SessionService) {}

//   //first version
//   @Mutation(() => UserModel)
//   async loginUser(
//     @Args('data') input: LoginInput,
//     @Context() { req }: GqlContext
//   ): Promise<UserModel> {
//     const userAgent = req.headers['user-agent'] || '' //added this
//     const user = await this.sessionService.login(req, input, userAgent)

//     // Optional: cast if needed or return manually mapped object
//     // return {
//     //   id: user.id,
//     //   email: user.email,
//     //   username: user.username
//     // }
//     return Object.assign(new UserModel(), {
//       id: user.id,
//       email: user.email,
//       username: user.username
//     })
//   }

//   //week 7: 
//   @Mutation(() => UserModel)
// loginUser(@Args('data') input: LoginInput, @UserAgent() userAgent: string, @Context() { req }: GqlContext) {
// 	return this.sessionService.login(req, input, userAgent)
// }

@Mutation(() => UserModel)
async loginUser(
  @Args('data') input: LoginInput, @UserAgent() userAgent: string,
  @Context() { req }: GqlContext): Promise<UserModel> {
  const user = await this.sessionService.login(req, input, userAgent)

  return Object.assign(new UserModel(), {
    id: user.id,
    email: user.email,
    username: user.username
  })

}

  @Mutation(() => Boolean)
  async logoutUser(
    @Context() { req }: GqlContext
  ): Promise<boolean> {
    return this.sessionService.logout(req)
  }


//adding: 

  @Authorization()
  @Mutation(() => Boolean)
  async removeSession(
    @Args('id') id: string,
    @Context() { req }: GqlContext
  ): Promise<boolean> {
    return this.sessionService.remove(req, id)
  }


  @Authorization()
  @Query(() => [SessionModel])
  async findSessionsByUser(@Context() { req }: GqlContext) {
    return this.sessionService.findByUser(req)
  }

  @Authorization()
  @Query(() => SessionModel)
  async findCurrentSession(@Context() { req }: GqlContext) {
    return this.sessionService.findCurrent(req)
  }

  @Authorization()
  @Mutation(() => Boolean)
  async clearSessionCookie(@Context() { req }: GqlContext) {
    return this.sessionService.clearSession(req)
  }



}
 