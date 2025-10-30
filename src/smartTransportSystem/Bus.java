package smartTransportSystem;

public class Bus implements Transport {
    private final double priceIsKm = 0.6;
    private final double speed = 60;

    @Override
    public double calculateFare(double distance) {
        return priceIsKm * distance;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return distance * priceIsKm * passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Bus" + "-" + priceIsKm + " " + "manat" + " " + speed + "km/h";
    }
}
