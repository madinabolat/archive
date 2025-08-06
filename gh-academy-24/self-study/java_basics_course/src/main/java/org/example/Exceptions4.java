package org.example;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
//        try {
//            run();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            run();
//        } catch (IOException | ParseException e) {
//            throw new RuntimeException(e);
//        }
        try {
            run();
        } catch (Exception e){ //polymorphism because other exceptions extend Exception

        }
    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
