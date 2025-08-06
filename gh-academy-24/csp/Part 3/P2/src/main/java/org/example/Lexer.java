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
        lexeme_hm.put("", ""); //to do
    }

    public void createTokens(){
        lexemes = input.split("\\s+|\\+|\\(|\\)|\\;|\\=");
        //lexemes = input.split("\\+|(|)|\\s+");
        for (String lexeme : lexemes){
            Token token = new Token();
            token.value = lexeme;
            if (lexeme_hm.containsValue(lexeme)){
                token.type = lexeme_hm.get(lexeme);
            }
            else{
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
