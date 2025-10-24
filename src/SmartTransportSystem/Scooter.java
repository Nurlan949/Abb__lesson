package SmartTransportSystem;

public class Scooter implements Transport {
    private final double priceIsKm = 0.3;
    private final double speed = 25;

    @Override
    public double calculateFare(double distance) {
        return distance * priceIsKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "scooter" + "-" + priceIsKm + " " + "manat" + " " + speed + "km/h";
    }
}
