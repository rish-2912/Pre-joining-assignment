package oops.abstraction;

public class ElectricCar extends Car implements Electric {
    private int batteryLife;

    public ElectricCar(String model, int year, int numberOfDoors, int batteryLife) {
        super(model, year, numberOfDoors);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the electric car battery.");
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car engine started silently.");
    }
}