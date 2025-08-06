package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MyTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        String[] items = expression.split(" ");
        String operator = items[0];
        if (!Arrays.asList("ADD","MUL","DIV","SUB").contains(operator)){
            System.out.println("Proper operand is expected");
            return;
        }
        if (items.length<3){
            System.out.println("Too few arguments");
            return;
        }
        int operand1 = 0;
        int operand2 = 0;
        try {
            operand1 = Integer.parseInt(items[1]);
        } catch(NumberFormatException e){
            System.out.println("Integer is expected");
            return;
        }
        try {
            operand2 = Integer.parseInt(items[2]);
        } catch(NumberFormatException e){
            System.out.println("Integer is expected");
            return;
        }
        switch(operator){
            case "ADD":
                System.out.println(operand1+operand2);
                break;
            case "SUB":
                System.out.println(operand1-operand2);
                break;
            case "MUL":
                System.out.println(operand1*operand2);
                break;
            case "DIV":
                try{
                    System.out.println(operand1/operand2);
                }
                catch (ArithmeticException e){
                    System.out.println("Can't divide by zero");
                }
                break;
        }
    }
}
