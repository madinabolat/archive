package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    public static void main(String[] args) {
        Car car1 = new PassengerCar("Toyota", 2010, 35000, 1500, Color.BLUE, "Automat", true);
        Car car2 = new Bus("Chevrolet", 2008, 25000, 1200, Color.WHITE, "Automat", true);
        Car car3 = new Bus("Chevrolet", 2008, 25000, 1200, Color.WHITE, "Automat", true);
        car1.addMileage(1000);
        System.out.println(car1.getMileage());
        System.out.println(car1.toString());
        car1.addMileage(15.7);
        System.out.println(car1.toString());
//        System.out.println(car1==car2);
//        System.out.println(car3==car2);
//        System.out.println(car2.equals(car3));

        car1.addMileage(15000);
        car2.addMileage(15000);
        System.out.println(car1.isReadyForService());
        System.out.println(car2.isReadyForService());

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println(cars);



    }
}
