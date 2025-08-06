package org.example;

public class Lesson23_StringBuilder {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " my";
        String s3 = " friend";
        String sAll = s1+s2+s3; //strings are immutable. so this creates two new string objects s1+s2, then (s1+s2)+s3
        //inefficient. if we do it often or in a loop, creates a lot of objects.
        //StringBuilder is mutable
        StringBuilder sb = new StringBuilder("hi");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        sb.append(" how").append("are").append("you?");
        System.out.println(sb.toString());
        //StringBuilders are mutable, can change,so no new objects are created

    }
}
