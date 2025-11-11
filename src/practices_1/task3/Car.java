package practices_1.task3;

import java.util.Optional;

public class Car {
    private String nema;

    public Car(String nema) {
        this.nema = nema;
    }

    public String getNema() {
        return nema;
    }

    public void setNema(String nema) {
        this.nema = nema;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nema='" + nema + '\'' +
                '}';
    }
    //    private Integer model;
//    private String repear;
//
//    public String getRepear() {
//        return repear;
//    }
//
//    public void setRepear(String repear) {
//        this.repear = repear;
//    }
//
//    public Car(String nema, Integer model, String repear) {
//        this.nema = nema;
//        this.model = model;
//        this.repear = repear;
//    }
//
//    public String getNema() {
//        return nema;
//    }
//
//    public void setNema(String nema) {
//        this.nema = nema;
//    }
//
//    public Integer getModel() {
//        return model;
//    }
//
//    public void setModel(Integer model) {
//        this.model = model;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "nema='" + nema + '\'' +
//                ", model=" + model +
//                ", repear='" + repear + '\'' +
//                '}';
//    }
    public static Optional<String> optionalString(String name) {
        // Eğer name null veya boş değilse, Optional ile sarıyoruz
        if (name != null && !name.isEmpty()) {
            return Optional.of(name); // Değer varsa Optional ile döndür
        } else {
            return Optional.empty(); // Boş Optional döndür
        }
    }

}
