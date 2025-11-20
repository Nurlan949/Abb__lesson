package design_patterns.facade;

public class Practice {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Light light=new Light();
        CarFacade carFacade=new CarFacade(engine,light);
        carFacade.startCar();
        carFacade.stopCar();
    }
}
