package practices_1.practice_3;

public class MethodOverloading {
    public void drive(String name,int distance){
        System.out.println("driving"+distance+"miles"+name);
    }
    public void drive(){
        System.out.println("driving"+"distance"+"miles"+"name");

    }
}
