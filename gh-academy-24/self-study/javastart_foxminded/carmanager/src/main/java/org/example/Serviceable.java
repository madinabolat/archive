package org.example;

public interface Serviceable {
    public void addMileage(int extraMileage);

    public void addMileage(double extraMileage);

    public boolean isReadyForService();

    public int getMileage();

    public int getMileageOnService();
}
