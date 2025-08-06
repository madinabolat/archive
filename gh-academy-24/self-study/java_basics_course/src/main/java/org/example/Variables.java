package org.example;

public class Variables {
    public static void main(String[] args) {
        int myInt; //declaration -> allocates memory. but empty
        myInt = 5; // initialization. put value in the "box"
        // int myInt = 5; -> can declare and init in one

        short myShort = 3; //2 bytes
        //// integer is 4 bytes
        long myLong = 5; // 8 bytes

        byte myByte = 120; // 1 byte. -128 to 127 -> when you have small int and want to save memory

        double myDouble = 5.4; //8 bytes
        float myFloat = 5.4f; //by default it is double, need to add f to make it float
        //float - 4 bytes

        boolean myBoolean = true;
    }
}
