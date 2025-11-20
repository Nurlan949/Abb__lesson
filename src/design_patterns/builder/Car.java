package design_patterns.builder;

public class Car {

    private final int seats;
    private final String engine;
    private double fuel = 0;

    public Car(int seats, String engine, double fuel) {
        this.seats = seats;
        this.engine = engine;
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public double getFuel() {
        return fuel;
    }
}
