import { Field, ID, ObjectType } from '@nestjs/graphql'
import type { User } from '@/prisma/generated'

@ObjectType()
export class UserModel implements User {
  //@Field(() => ID)
  @Field(() => ID, { nullable: true })
  public id: string

//  @Field(() => String)
  @Field(() => String, { nullable: true })
  public email: string

  @Field(() => String)
  public password: string

  //@Field(() => String)
  @Field(() => String, { nullable: true })
  public username: string

  @Field(() => String)
  public displayName: string

  @Field(() => String, { nullable: true })
  public avatar: string

  @Field(() => String, { nullable: true })
  public bio: string

  @Field(() => Date)
  public createdAt: Date

  @Field(() => Date)
  public updatedAt: Date
}