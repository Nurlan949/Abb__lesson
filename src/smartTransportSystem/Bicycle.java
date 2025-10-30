package smartTransportSystem;

public class Bicycle implements Transport {
    private final double priceIsKm = 0.2;
    private final double speed = 15;

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
         return "Bicyle"  + "-" + priceIsKm + " " + "manat" + " " + speed + "km/h";
    }
}
