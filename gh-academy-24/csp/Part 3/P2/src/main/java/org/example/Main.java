package org.example;

public class Main {
    public static void main(String[] args) {
        String input = """
                x=5;
                if (x>3) {
                    y = x+2;
                }
                else {   \s
                    y = x * (2+3);
                }
                end;
                print y;
                """;

        Lexer lexer = new Lexer(input);
        lexer.printTokens();


        //should produce the following lexemes:
//        [ "x", "=", "5", ";", "if", "(", "x", ">", "3", ")", "{", "y", "=", "x", "+", "2", ";", "}",
//                "else", "{", "y", "=", "x", "*", "(", "2", "+", "3", ")", ";", "}", "print", "y", ";" ]

//    BNF Grammar:
//    <program> ::= <statement> | <program> <separator>
//    <separator> ::= "\n" | ";"
//    <statement> ::= <expr> | <if_statement> | <function_call>
//    <function_call> ::= "print" <identified>
//    <if_statement> ::= "if" <condition> "{" <program> "}" "else" <else_statement>?
//    <else_statement> ::= "else" <program>
//    <condition> ::= <expr> <comparison> <expr>
//    <comparison> ::= "==" |  "<=" |  ">=" |  "<" |  ">" |  "!="
//    <expr> ::= <term> | <expr> "+" <term> | <expr> "-" <term>
//    <term> ::= <factor> | <term> * <factor> | <term> / <factor>
//    <factor> ::= <number> | <identifier> | "(" <expr> ")"
//    <identifier> ::= <letter> | <identifier> <letter_or_digit>
//    <number> ::= <digit> | <number> <digit>
//    <letter_or_digit> ::= <letter> | <digit>
//    <digit> ::= "0" | "1" | "2" | "3" | "4"| "5" | "6" | "7"| "8" | "9"
//    <letter> ::= "a" | "b" | "c" | ... | "z" | "A" | "B" | ... | "Z"


    }
}