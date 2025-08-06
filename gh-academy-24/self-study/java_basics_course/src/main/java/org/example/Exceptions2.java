package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        while (true){ //infinite cycle until we end the program
//            int x = Integer.parseInt(scanner.nextLine());
//            if (x!=0){
//                throw new IOException();
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true){ //infinite cycle until we end the program
//            int x = Integer.parseInt(scanner.nextLine());
//            if (x!=0){
//                try {
//                    throw new IOException();
//                } catch (IOException e) {
////                    throw new RuntimeException(e);
//                    System.out.println("You entered nonzero number");
//                }
//            }
//        }
//    }


    public static void main(String[] args) throws NewExceptionExample {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x!=0){
                throw new NewExceptionExample("You entered nonzero number");
            }
        }
    }
}
