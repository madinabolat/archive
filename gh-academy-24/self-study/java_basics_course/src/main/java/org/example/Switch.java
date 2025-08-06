package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        //instead of a lot of if statements, you can use switch:
        switch(age){
            case 0:
                System.out.println("Just born");
                break;
            case 7:
                System.out.println("You went to school");
                break;
            case 18:
                System.out.println("You went to college");
                break;
            default:
                System.out.println("Just an age");
        }
    }
}
