package bus_simulation;

import java.util.*;

public class BusSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        List<Queue<Passenger>> stop = new ArrayList<>();
        List<Passenger> bus = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Queue<Passenger> passengerQueue = new LinkedList<>();
            for (int j = 1; j <= random.nextInt(3) + 3; j++)
                passengerQueue.add(new Passenger("randomName" + i + "p" + j, random.nextBoolean()));
            stop.add(passengerQueue);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1);
            int drop = random.nextInt(3);
            for (int j = 0; j <= drop && !bus.isEmpty(); j++) {
                Passenger remove = bus.remove(random.nextInt(bus.size()));
                System.out.println(remove.getName() + "remove the bus");
            }
            Queue<Passenger> stops = stop.get(i);
            List<Passenger> all = new ArrayList<>(stops);
            stops.clear();

            for (Passenger passenger : all) {
                if (bus.size() < 5) {
                    bus.add(passenger);
                    System.out.println(passenger + "boarded the bus");
                } else {
                    stops.add(passenger);
                }
                System.out.println("bus now" + bus);
                System.out.println("stop" +"-"+ (i + 1) + "remaning" + stops);
            }
            System.out.println("simulation finish");
            System.out.println("final passenger"+bus);
        }


    }

}
