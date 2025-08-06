package org.example;

public class Bus extends Car {

    public Bus(String name, int yearOfProduction, int price, int weight, Color color, String engineType, boolean isReadyToDrive) {
        super(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
    }

    @Override
    public boolean isReadyForService() {
        if (mileageOnService > 50000){
            return true;
        }
        return false;
    }
}
