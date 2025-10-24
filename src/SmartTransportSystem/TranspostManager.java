package SmartTransportSystem;

import java.util.Scanner;

public class TranspostManager {
    public static Transport getTransport(TransportType transportType) {
        switch (transportType) {
            case BUS -> {
                return new Bus();
            }
            case TAXI -> {
                return new Taxi();
            }
            case BICYCLE -> {
                return new Bicycle();
            }
            case SCOOTER -> {
                return new Scooter();
            }
            default -> throw new RuntimeException("seciminiz  sehvdir");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Transport novunu sec" + ":" + "Bus,Taxi,Scooter,Bicycle");
        String input = scanner.nextLine().toUpperCase();
        TransportType type = TransportType.valueOf(input);
        System.out.println("mesafeni qeyd edin (km/s)");
        double distance = scanner.nextDouble();
        System.out.println("sernisin sayini qeyd edin");
        int passengers = scanner.nextInt();
        Transport transport =getTransport(type);
        System.out.println(transport.getTransportInfo());
        System.out.println("texmini vaxt"+":"+transport.calculateTime(distance));
        System.out.println("qiymet (manat)"+":"+transport.calculateFare(distance,passengers));

    }

}
