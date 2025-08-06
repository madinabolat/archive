import { Injectable, ConflictException } from '@nestjs/common';
import { PrismaService } from 'src/core/prisma/prisma.service'; // adjust the path if needed
import { CreateUserInput } from './inputs/create-user.input'; // adjust if needed
import * as bcrypt from 'bcrypt';


@Injectable()
export class AccountService {
    // findAll() {
    //     return [
    //      // "Helloworld"
    //       // {
    //       //   id: '1',
    //       //   email: 'test@example.com',
    //       //   name: 'Test User',
    //       // },
    //     ];
    //   }

    constructor(private prisma: PrismaService) {}
   
    async findAll() {
      return this.prisma.user.findMany();
    }

    async create(input: CreateUserInput) {
      const { username, email, password } = input;
  
      // Check for existing user
      const existing = await this.prisma.user.findFirst({
        where: {
          OR: [{ username }, { email }],
        },
      });
  
      if (existing) {
        throw new ConflictException('Username or email already exists');
      }
  
      // Hash password
      const hashedPassword = await bcrypt.hash(password, 10);
  
      // Create user
      await this.prisma.user.create({
        data: {
          username,
          email,
          password: hashedPassword,
          displayName: username, // optional, based on instructions
        },
      });
  
      return true;
    }

    //method to retrieve current user
  public async me(id: string) {
  const user = await this.prisma.user.findUnique({
	//const user = await this.prismaService.user.findUnique({
		where: {
			id,
		},
	})
	return user
}



}

