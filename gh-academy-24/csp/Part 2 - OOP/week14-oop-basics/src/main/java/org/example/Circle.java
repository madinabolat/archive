package org.example;

public class Circle extends Shape{
    double rad;

    Circle(double rad){
        this.rad = rad;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(rad,2);
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * rad;
    }
}
