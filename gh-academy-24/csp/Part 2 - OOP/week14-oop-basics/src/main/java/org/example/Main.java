package org.example;
public class Main {
    public static void main(String[] args) {
//        Dog myDog = new Dog();
//        myDog.eat();
        Circle myCircle = new Circle(2);
        System.out.println("Area is " + myCircle.calculateArea());
        System.out.println("Perimeter is " + myCircle.calculatePerimeter());
    }
}