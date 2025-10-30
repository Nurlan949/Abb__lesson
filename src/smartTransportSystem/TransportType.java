package smartTransportSystem;

public enum TransportType {
    TAXI(2.0,90), BUS(0.6,60), BICYCLE(0.2,15), SCOOTER(0.3,25);

    private final double priceIsKm;
    private final double speed;

    TransportType(double priceIsKm, double speed) {
        this.priceIsKm = priceIsKm;
        this.speed = speed;
    }

}
