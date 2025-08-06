package org.example;

public class Exceptions3 {
    public static void main(String[] args) {
        //Unchecked - Runtime exception -> actual errors
        //Checked - Compile time exception -> edge cases in your program
        //Unchecked errors:
        int a = 1/0;
        String s = null;
        s.length();
        int[] arr = new int[2];
        System.out.println(arr[2]);

    }
}
