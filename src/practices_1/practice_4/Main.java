package practices_1.practice_4;

public class Main {
    public static void main(String[] args) {
//        Car.Engine engine=new Car("merc","black").new Engine(500);
//        engine.start();
//        Car.engineStatic engineStatic=new Car.engineStatic(300);
//        AnonymousImpl anonymous = new Tv() {
//            @Override
//            public void display() {
//                System.out.println("display in Tv");
//
//            }
//        };
//        anonymous.display();
//        AnonymousImpl anonymous1 = new Projector() {
//            @Override
//            public void display() {
//                System.out.println("display in Projector");
//            }
//        };
//        anonymous1.display();
        Employee name_Nurlan=new Employee("Nurlan",19,1000);
        Employee name_Nurlanisclone=new Employee("Nurlan",19,1000);
        System.out.println(name_Nurlanisclone.equals(name_Nurlan));


    }
}


