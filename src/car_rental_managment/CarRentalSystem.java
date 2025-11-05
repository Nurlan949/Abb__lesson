package car_rental_managment;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CarRentalSystem implements CarRentalSystemImpl {
    Set<Car> carSet = new HashSet<>();
    Map<Customer, Car> customerCarMap = new HashMap<>();
    Map<Car, LocalDateTime> carLocalDateTimeMap = new HashMap<>();
    Set<Car> cars = new HashSet<>();
    Map<Car, LocalDateTime> localDateTimeCars = new HashMap<>();

    @Override
    public void rentCar(Customer c, Car car) {
        if (car.getCarEnum() == CarEnum.AVAILABLE) {
            customerCarMap.put(c, car);
            carLocalDateTimeMap.put(car, LocalDateTime.now());
            car.setCarEnum(CarEnum.RENTED);
            System.out.println(c.getName() + ":" + "adli musteri" +"-"+ car.getBrand() + ":" + "bu masini kirayeledi");
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
        LocalDateTime returnTime = LocalDateTime.now();
        car.setCarEnum(CarEnum.AVAILABLE);
        carSet.add(car);
        customerCarMap.remove(c);
        carLocalDateTimeMap.remove(car);

        System.out.println(c.getName() + ":" + "adli muster" +"-"+ car.getBrand() + ":" + "bu masini iade etdi");
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
        boolean findHistory = false;
        for (Car car : carSet) {
            if (car.getCarEnum() == CarEnum.AVAILABLE) {
                System.out.println(car.getBrand() + ":" + car.getModel() +"-"+ "bosdur");
                findHistory = true;
            } else {
                System.out.println("hec bir tarix yoxdur");
            }


        }
    }
}
