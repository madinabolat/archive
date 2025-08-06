package org.example;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.print("Hello Everybody");
//        System.out.print(" and my friends");
        String message = "Hello world!";
//        System.out.println(message);

        String words = "Java forever";
        System.out.println(message);
        System.out.println(words);
        String space = " ";
        System.out.println(message + space + words);

        int i = 42;
        int j = 3;
        System.out.println(i+j);
        double d = 2.5;
        double answer = i + j * d;
        System.out.println(answer);

        String number = "-2";
        int result = (int) (answer + Integer.parseInt(number));
        String oneMoreAnswer = message + " " + result;
        System.out.println(oneMoreAnswer);

        int hugeNumber = 521124244;
        System.out.println(hugeNumber % i);

        boolean evenNumber = i%2==0 ? true : false;
//        if (i%2==0){
//            evenNumber = true;
//        } else {
//            evenNumber = false;
//        }
        System.out.println(evenNumber);

    }
}
