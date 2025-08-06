package org.example;

public class StringUtil {
    public static void main(String[] args) {
        String source = "Hello world!";

        String[] words = source.split(" ");

        for (int i = 0; i < words.length; i++){
            System.out.println(words[0]);
            char[] letters = words[i].toCharArray();
            System.out.println(letters.length);
        }

    }
}
