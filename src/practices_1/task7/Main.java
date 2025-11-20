package practices_1.task7;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Thread thread1=new Thread(()->{
            Immutable immutable=Immutable.of("Nurlan",4);
            System.out.println("immutable"+immutable);

        });
        Thread thread2=new Thread(()->{
            Immutable immutable=Immutable.of("Ferid",5);
            System.out.println("immutable"+immutable);

        });
        thread1.start();
        thread2.start();
    }
}
