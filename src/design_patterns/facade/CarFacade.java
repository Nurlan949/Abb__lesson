package design_patterns.facade;

public class CarFacade {
    private Engine engine;
    private Light light;

    public CarFacade(Engine engine, Light light) {
        this.engine = engine;
        this.light = light;
    }
    public void startCar() {
        light.turnOn();
        engine.start();
        System.out.println("avto starting");
    }
    public void stopCar() {
        light.turnOff();
        engine.start();
        System.out.println("avto off");
    }
}
