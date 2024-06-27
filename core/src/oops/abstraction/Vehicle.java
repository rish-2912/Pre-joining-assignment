package oops.abstraction;

abstract public class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Abstract method
    public abstract void startEngine();
}

// Interfaces can be thought of a constraint which when implemented by some
// class will have to be satisfied by that class
interface Electric {
    void chargeBattery();
}
