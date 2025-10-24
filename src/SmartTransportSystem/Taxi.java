package SmartTransportSystem;

public class Taxi implements Transport {
    private final double priceIsKm = 2.0;
    private final double speed = 90;

    @Override
    public double calculateFare(double distance) {
        return distance * priceIsKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return (distance * priceIsKm) + (passengers * 0.2);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Taxi" + "-" + priceIsKm + " " + "manat" + " " + speed + "km/h";
    }
}
