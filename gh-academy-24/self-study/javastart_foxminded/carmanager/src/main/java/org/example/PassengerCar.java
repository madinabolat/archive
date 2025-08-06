package org.example;

public class PassengerCar extends Car{

    public PassengerCar(String name, int yearOfProduction, int price, int weight, Color color, String engineType, boolean isReadyToDrive) {
        super(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
    }

    @Override
    public boolean isReadyForService() {
        if (mileageOnService > 10000){
            return true;
        }
        return false;
    }
}
