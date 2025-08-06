import { ApolloDriver } from "@nestjs/apollo";
import { ConfigModule, ConfigService } from "@nestjs/config";
import { GraphQLModule } from "@nestjs/graphql";
import { getGraphQLConfig } from "./config/graphql.config";
import { PrismaModule } from "./prisma/prisma.module";
import { RedisModule } from "./redis/redis.module";
import { AccountModule } from "@/modules/auth/account/account.module";
import { Module } from "@nestjs/common";
import { SessionModule } from '@/modules/auth/session/session.module';


@Module({
    imports: [
      ConfigModule.forRoot({ isGlobal: true }),
      GraphQLModule.forRootAsync({
        driver: ApolloDriver,
        imports: [ConfigModule],
        useFactory: getGraphQLConfig,
        inject: [ConfigService]
      }),
      PrismaModule,
      AccountModule,
      RedisModule,
      SessionModule, 
    ],
  })
  export class CoreModule {}
  