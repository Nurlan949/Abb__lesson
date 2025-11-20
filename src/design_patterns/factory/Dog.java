package design_patterns.factory;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}
