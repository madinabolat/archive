//adding this (not in the task)
import { ObjectType, Field, Float } from '@nestjs/graphql'

// Local GraphQL class versions
@ObjectType()
class LocationInfoModel {
  @Field()
  country: string

  @Field()
  city: string

  @Field(() => Float)
  latidute: number

  @Field(() => Float)
  longitude: number
}

@ObjectType()
class DeviceInfoModel {
  @Field()
  browser: string

  @Field()
  os: string

  @Field()
  type: string
}

// Main session model
@ObjectType()
export class SessionModel {
  @Field()
  id: string

  @Field()
  createdAt: Date

  @Field(() => LocationInfoModel)
  location: LocationInfoModel

  @Field(() => DeviceInfoModel)
  device: DeviceInfoModel

  @Field()
  ip: string
}
