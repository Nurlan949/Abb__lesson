package practices_1.practice_4;

public class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void drive() {
        System.out.println("drive");
    }

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void start() {
            System.out.println("starting");
            drive();
        }
    }

    static class engineStatic {
        private int horsePowerInStatic;

        public engineStatic(int horsePowerInStatic) {
            this.horsePowerInStatic = horsePowerInStatic;
        }

        public void startEngineStatic() {
            System.out.println("masinin at gucy");
            startEngineStatic();
            System.out.println(horsePowerInStatic);


        }
    }
}
