package org.example;

public class Main {
    public static void main(String[] args) {
        String input = """
        config "num_users" = 100
        config "request_rate" = 5.5
        config "timeout" = 30
        update "num_users" = 200
        update "request_rate" = 7.5
        compute "total_requests" = %num_users * %request_rate
        compute "total_timeout" = %num_users * %timeout
        show configs""";

        Lexer lexer = new Lexer(input);
        lexer.printTokens();


        //output type
        //Token{type=CONFIG, value = 'config'}
        //Token{type=STRING, value = 'num_users'}
        //Token{type=ASSIGNMENT, value = '='}
        //Token{type=NUMBER, value = '100'}
        //exception Unsupported character: &

//    BNF:
//    <program> ::= <statement> | <program> <statement>
//    <statement> ::= <config_statement> |  <update_statement> |  <compute_statement> | <show_statement>
//    <config_statement> ::= "config" <string> "=" <number>
//    <update_statement> ::= "update" <string> "=" <number>
//    <compute_statement> ::= "compute" <string> "=" "%" <identifier> <operator> "%" <identifier>
//    <show_statement> ::= "show" "configs"
//    <string> ::= \""" <identifier> \"""
//    <identifier> ::= <letter> <alphanumeric>*
//    <alphanumeric> ::= <letter> | <digit>
//    <number> ::= <digit>+("."<digit>+)?
//    <letter> ::= [a-zA-Z]
//    <digit> ::= [0-9]

    }
}