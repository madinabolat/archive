import { InputType, Field } from '@nestjs/graphql';
import { IsString, IsNotEmpty, IsEmail, MinLength, Matches } from 'class-validator';


@InputType()
export class CreateUserInput {
	@Field(() => String)
	@IsString()
	@IsNotEmpty()
	@Matches(/^[a-zA-Z0-9]+(?:-[a-zA-Z0-9]+)*$/)
	public username: string

	@Field(() => String)
	@IsEmail()
	@IsNotEmpty()
	public email: string;
	
	@Field(() => String)
	@MinLength(8)
	@Matches(/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).+$/)
	public password: string;
}