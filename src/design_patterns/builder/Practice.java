package design_patterns.builder;

public class Practice {
    public static void main(String[] args) {
        Car car=new Car(4,"v12",2.9);
        System.out.println(car.getEngine());
        System.out.println(car.getFuel());
        System.out.println(car.getSeats());

    }
}
