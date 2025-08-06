package org.example;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println("Hello " + i);
        }
        for (int i = 0; i <= 10; i+=5){
            System.out.println("Hello " + i);
        }
        for (int i = 10; i >= 0; i--){
            System.out.println("Hello " + i);
        }
        for (int i = 10; i >= 0; i-=5){
            System.out.println("Hello " + i);
        }
    }
}
