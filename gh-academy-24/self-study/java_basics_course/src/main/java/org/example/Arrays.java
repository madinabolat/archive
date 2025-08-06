package org.example;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; //primitive data type. [10]  (there is a box, and we put 10 in it)
        String s = new String("Hello"); //pointer data type. Class String. Object "Hello". s is pointing to the object.
        //alternative way:
        String s1 = "Hello"; 
        int[] numbers = new int[5]; //pointer data type. numbers -> [array] (number is pointing to array object)
        System.out.println(numbers[3]);
        for (int i=0;i<numbers.length;i++){
            numbers[i]=3*i;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1, 2, 3, 4};

    }
}
