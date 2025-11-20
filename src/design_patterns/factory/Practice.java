package design_patterns.factory;

public class Practice {
    public static void main(String[] args) {
//        Animal cat =new Cat();
//        cat.makeSound();
//        Animal dog=new Dog();
//        dog.makeSound();
//        Animal elephants=new Elephants();
//        elephants.makeSound();

        //factory
        Animal catF=Factory.createAnimal("cat");
        catF.makeSound();
        Animal dogF=Factory.createAnimal("dog");
        dogF.makeSound();
        Animal elephantsF=Factory.createAnimal("elephants");
        elephantsF.makeSound();


    }


}
