package org.example;

import java.util.Objects;

public abstract class Car implements Serviceable{
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;
    private int mileage = 0;
    protected int mileageOnService = 0;

    public Car(String name, int yearOfProduction, int price, int weight, Color color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    public void addMileage(int extraMileage){
        this.mileage += extraMileage;
        this.mileageOnService += extraMileage;
    }

    public void addMileage(double extraMileage){
        this.mileage += Math.round(extraMileage);
        this.mileageOnService += Math.round(extraMileage);
    }

    public abstract boolean isReadyForService();

    public int getMileage() {
        return mileage;
    }

    public int getMileageOnService() {
        return mileageOnService;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                ", mileage=" + mileage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && price == car.price && weight == car.weight && isReadyToDrive == car.isReadyToDrive && Objects.equals(name, car.name) && color == car.color && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
    }


}
