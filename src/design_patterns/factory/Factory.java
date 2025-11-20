package design_patterns.factory;

public class Factory {
  public static Animal createAnimal(String animalType){
      if (animalType.equalsIgnoreCase("cat")){
          return new Cat();
      }else if ((animalType.equalsIgnoreCase("dog"))){
          return new Dog();
      } else if (animalType.equalsIgnoreCase("elephants")) {
          return new Elephants();

      }else {
       throw new IllegalArgumentException("Invalid animal type");
      }

  }
}
