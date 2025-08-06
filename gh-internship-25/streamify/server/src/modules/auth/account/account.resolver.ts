import { Query, Resolver } from '@nestjs/graphql';
import { AccountService } from './account.service';
import { UserModel } from './models/user.model';
import { Mutation, Args } from '@nestjs/graphql';
import { CreateUserInput } from './inputs/create-user.input'; // adjust path if needed
import { Authorization } from '@/shared/decorators/auth.decorator'
import { Authorized } from '@/shared/decorators/authorized.decorator'



@Resolver('Account')
export class AccountResolver {
  constructor(private readonly accountService: AccountService) {}

  @Query(() => [UserModel], { name: 'findAllUsers' })
  public async findAll() {
    return this.accountService.findAll()
  }

  @Mutation(() => Boolean, { name: 'createUser' })
public async create(@Args('data') input: CreateUserInput) {
  return this.accountService.create(input);
}

@Authorization() // 🔐 Guard the route
@Query(() => UserModel, { name: 'findProfile' })
public async me(@Authorized('id') id: string) {
	return this.accountService.me(id)
}

}



