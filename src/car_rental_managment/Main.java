package car_rental_managment;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();
        Car c1 = new Car(1L, "Toyota", "Camry", 2022, CarEnum.AVAILABLE);
        Car c2 = new Car(2L, "BMW", "X5", 2023, CarEnum.AVAILABLE);
        Car c3 = new Car(3L, "Hyundai", "Elantra", 2021, CarEnum.AVAILABLE);
        system.addCar(c1);
        system.addCar(c2);
        system.addCar(c3);
        Customer customer1 = new Customer(101L, "Nurlan", "AZ12345");
        Customer customer2 = new Customer(102L, "Kamil", "AZ67890");
        Customer customer3 = new Customer(103L, "Nazim", "AZ24680");

        system.rentCar(customer1, c1);
        system.rentCar(customer2,c2);
        system.rentCar(customer3,c3);
//        system.rentCar(customer1,c1); rented yoxlamaq ucun
        system.printActiveRentals();
        system.printAvailableCars();
        system.returnCar(customer1);
        system.printRentalHistory();


    }
}
