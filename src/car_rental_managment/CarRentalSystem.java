package car_rental_managment;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class CarRentalSystem implements CarRentalSystemImpl {
    Set<Car> carSet = new HashSet<>();
    Map<Customer, Car> customerCarMap = new HashMap<>();
    Map<Car, LocalDateTime> carLocalDateTimeMap = new HashMap<>();
    Set<Car> cars = new HashSet<>();
    Map<Car, LocalDateTime> localDateTimeCars = new HashMap<>();
    List<String> rentalHistory = new ArrayList<>();

    @Override
    public void rentCar(Customer c, Car car) {
        if (car.getCarEnum() == CarEnum.AVAILABLE) {
            customerCarMap.put(c, car);
            carLocalDateTimeMap.put(car, LocalDateTime.now());
            car.setCarEnum(CarEnum.RENTED);
            System.out.println(c.getName() + ":" + "adli musteri" + "-" + car.getBrand() + ":" + "bu masini kirayeledi");
        } else if (car.getCarEnum() == CarEnum.RENTED) {
            System.out.println("kirayelenib");
        } else {
            System.out.println("masin sistemde yoxdur");
        }
    }

    @Override
    public void returnCar(Customer c) {
        Car car = customerCarMap.get(c);
        LocalDateTime rentTime = carLocalDateTimeMap.get(car);
        LocalDateTime returnTime = rentTime.plusHours(50).plusMinutes(150);
        Duration duration = Duration.between(rentTime, returnTime);
        Long hours = duration.toHours();
        Long day = hours / 24;
        Long remaining = hours % 24;
        car.setCarEnum(CarEnum.AVAILABLE);
        carSet.add(car);
        customerCarMap.remove(c);
        carLocalDateTimeMap.remove(car);
        String historyEntry = car.getBrand() + " " + car.getModel() +
                "Rent" + " " + c.getName() +
                "From" + " " + rentTime +
                "To" + " " + returnTime +
                "Duration" + " " + day + "day " + remaining + " hours";
        rentalHistory.add(historyEntry);

        System.out.println(c.getName() + ":" + "adli muster" + "-" + car.getBrand() + ":" + "bu masini iade etdi");
    }

    @Override
    public void printActiveRentals() {
        for (Map.Entry<Customer, Car> customerCarEntry : customerCarMap.entrySet()) {
            Customer customer = customerCarEntry.getKey();
            Car car = customerCarEntry.getValue();
            LocalDateTime rentTime = carLocalDateTimeMap.get(car);
            System.out.println("musteri" + ":" + customer.getName());
            System.out.println("masin" + ":" + car.getBrand());
            System.out.println("rentTime" + ":" + rentTime);

        }
    }

    @Override
    public void printAvailableCars() {
        boolean find = false;
        for (Car car : cars) {
            if (car.getCarEnum() == CarEnum.AVAILABLE) {
                find = true;
            } else {
                find = false;
            }

        }
    }

    @Override
    public void printRentalHistory() {
        if (rentalHistory.isEmpty()) {
            System.out.println("hec bir tarix yoxdur");
        } else {
            for (String record : rentalHistory) {
                System.out.println(record);
            }

        }
    }
}
