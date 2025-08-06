package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Lexer {
    String input;
    String[] lexemes;
    ArrayList<Token> tokens = new ArrayList<Token>();
    HashMap<String, String> lexeme_hm = new HashMap<String, String>();

    public Lexer(String input) {
        this.input = input;
        initializeLexemeMap();
        createTokens();
    }

    public void initializeLexemeMap(){
        lexeme_hm.put("config", "CONFIG");
        lexeme_hm.put("UPDATE", "update");
        lexeme_hm.put("ASSIGNMENT", "=");
        lexeme_hm.put("COMPUTE", "compute");
        lexeme_hm.put("SHOW", "show configs"); // do I need a space here?
        // add more: identifier, *, NUMBER, STRING
    }

    public void createTokens(){
        lexemes = input.split(" ");
        for (String lexeme : lexemes){
            Token token = new Token();
            token.value = lexeme;
            if (lexeme_hm.containsValue(lexeme)){
                token.type = lexeme_hm.get(lexeme);
            }
            else{
                //check if string
                //check if float or integer
            }
            tokens.add(token);
        }
    }

    public void printTokens(){
        for (Token token : tokens){
            System.out.println("type = "+token.type + " , value = '"+token.value+"'");
        }
    }

    public class Token{
        String type;
        String value;
    }
}
