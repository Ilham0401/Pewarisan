package Latihan5;
public class Truck {
    // The Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;

    //The Truck class has one constructor
    public Truck(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

    //The Truck class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applybrake(int decrement) {
        speed = decrement;
    }

    public void speedUp(int increment) {
        speed = increment;
    }
}
