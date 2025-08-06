package org.example;

public class BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i==15){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("We are out of the loop");

        for (int j = 0; j < 15; j++){
            if(j%2==0){
                continue;
            }
            System.out.println(j+" is an odd number");
        }
    }
}
