package car_rental_managment;

public interface CarRentalSystemImpl {
    void addCar(Car car);
    void rentCar(Customer c, Car car);

    void returnCar(Customer c);

    void printActiveRentals();

    void printAvailableCars();

    void printRentalHistory();

}
