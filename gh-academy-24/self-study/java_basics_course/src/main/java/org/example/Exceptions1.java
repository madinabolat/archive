package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("asdf");
//        Scanner scanner = new Scanner(file);
//    }

//    public static void main(String[] args) {
//        File file = new File("asdf");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
////            e.printStackTrace();
//            System.out.println("No file found");
//        }
//    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
//    public static void main(String[] args) {
//        try{
//            readFile();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("file not found");
//        }
//    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("asdf");
        Scanner scanner = new Scanner(file);
    }
}
