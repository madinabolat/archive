package org.example;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //String s = "Hello"; //"Hello" is an object of class String, s is a pointer to the object
        //alternatively:
        //String s = new String("Hello");

        //alternatiey:
        //String s;
        //s = "Hello";

        //"Hello" is an object stored in String pool
        //several pointers can point to it
        //new String("Hello") is an object created in Heap
        //String Pool is a subset of Heap, but new String("Hello") is not in String pool, new keyword creates a new object in Heap

        Scanner s = new Scanner(System.in);
        System.out.println("Enter input");
//        String string = s.nextLine();
//        System.out.println("You entered " + string);
        int myInt = s.nextInt();
        System.out.println("You entered " + myInt);

    }
}
