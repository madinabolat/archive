package org.example;

public class Lesson23_StringFormatting {
    public static void main(String[] args) {
        System.out.printf("This is a string: %s \n", "NICE");
        System.out.printf("This is a number: %d \n", 10);
        System.out.printf("%d digit, %f float, %s string \n", 10, 10.5, "hello");
        System.out.printf("%d.00 digit \n", 10);
        System.out.printf("%10d digit \n", 10);
        System.out.printf("%-10d digit \n", 10);
    }
}
