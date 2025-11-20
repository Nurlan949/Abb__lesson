package design_patterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice {
    public static void main(String[] args) {
        Singleton.doCalculation(10, 2);

        try (ExecutorService executorService = Executors.newFixedThreadPool(50)) {
            for (int i = 0; i < 50; i++) {
                executorService.execute(() -> {
//                    Singleton singleton = Singleton.INSTANCE_STATIC;
//                    System.out.println(singleton.hashCode());
//                    Singleton singleton1=Singleton.HOLDER.getInstance();
//                    System.out.println(singleton1.hashCode());
                    SingletonEnum singletonEnum=SingletonEnum.INSTANCE;
                    System.out.println(singletonEnum.hashCode());
                });
            }
        }


    }


}

