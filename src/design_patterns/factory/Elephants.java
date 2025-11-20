package design_patterns.factory;

public class Elephants implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
