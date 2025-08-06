package org.example;

public class Lesson24_ClassObject_toString {
    public static void main(String[] args) {
        Human h1 = new Human("Jane", 3);
        //System.out.println(h1);
        //toString - built in method of class Object
        System.out.println(h1.toString());


    }

    //every class is an object of class Object
    //extends Object

    static class Human{
        private String name;
        private int age;

        public Human(String name1, int age1){
            this.name = name1;
            this.age = age1;
        }

        //can override toString from class Object
        @Override
        public String toString() {
            return name+", "+age;
        }
    }

}
