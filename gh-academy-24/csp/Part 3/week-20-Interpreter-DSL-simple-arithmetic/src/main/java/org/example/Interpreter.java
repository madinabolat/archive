package org.example;
import java.util.Scanner;

public class Interpreter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line;
        while ("quit".equalsIgnoreCase(line = s.nextLine())){
            System.out.println("Input entered:" + line);
            String[] expression = line.split(" ");
            if (expression.length!=3){
                System.out.println("Invalid expression: " + line);
                continue; // get the expression again
            }
            try{
                String operator = expression[0];
                int operand1 = Integer.parseInt(expression[1]);
                int operand2 = Integer.parseInt(expression[2]);
                int result = evaluate(operator, operand1, operand2);
                System.out.println(result);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid number received"); // for operand1, operand2 lines
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    private static int evaluate(String operator, int operand1, int operand2) {
        switch(operator){
            case("ADD"):
                return operand1+operand2;
            case("SUB"):
                return operand1-operand2;
            case("MUL"):
                return operand1*operand2;
            case("DIV"):
                if (operand2==0){
                    throw new IllegalArgumentException("Division by 0 is not allowed");
                }
                return operand1/operand2;
            default:
                throw new UnsupportedOperationException("Operation is not allowed");

        }
    }
}
