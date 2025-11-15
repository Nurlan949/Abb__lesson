package practices_1.task6;

import java.lang.reflect.Executable;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practica {
    public static void main(String[] args) {
        Thread_Practica practica = new Thread_Practica();
        practica.run();
        ThreadWithExtend threadWithExtend = new ThreadWithExtend();
        threadWithExtend.run();
        Thread threa = new Thread(() -> {
            System.out.println("Running thread");
        });
        threa.run();
        Counter counter = new Counter();
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter.incriment();
        };
        Thread t = new Thread(runnable, "My thread");
        Thread t1 = new Thread(runnable, "My thread");
//       t.start();
//       t1.start();
        NotificationService notificationService = new NotificationService();
        Thread thread = new Thread(() -> {
            try {
                notificationService.notifyUser();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        Thread thread9 = new Thread(() -> {
            notificationService.notifyAdmin();
        });
//        thread.start();
//        thread9.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("A" + LocalTime.now());

        });
        Thread thread2 = new Thread(() -> {

            try {
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("B" + LocalTime.now());
        });
        Thread thread3 = new Thread(() -> {

            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("C" + LocalTime.now());
        });
        Thread thread4 = new Thread(() -> {

            try {
                thread3.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("D" + LocalTime.now());
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }


}
