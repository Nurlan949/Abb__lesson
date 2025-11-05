package car_rental_managment;

import java.time.LocalDateTime;
import java.util.Objects;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private Integer year;
    private CarEnum carEnum;


    public CarEnum getCarEnum() {
        return carEnum;
    }

    public void setCarEnum(CarEnum carEnum) {
        this.carEnum = carEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Car(Long id, String brand, String model, Integer year, CarEnum carEnum) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.carEnum = carEnum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", carEnum=" + carEnum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
