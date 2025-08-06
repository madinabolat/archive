package org.example;

public class IfOperator {
    public static void main(String[] args) {
        int value = 25;
        if (value < 10 ){
            System.out.println("less than 10");
        }
        else if (value > 20){
            System.out.println("greater than 20");
        }
        else {
            System.out.println("other");
        }
    }
}
