package pizza_restaurant;

import java.util.Random;

public class PizzaOrder extends Thread {
    private final int orderId;
    private static final Random rand = new Random();

    public PizzaOrder(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        try {
            int prepare = rand.nextInt(3) + 1;
            synchronized (this) {
                System.out.println(orderId + ":" + "preparing pizza..");
                System.out.println("started");
            }
            Thread.sleep(prepare * 500);


            int bake = rand.nextInt(4) + 3;
            Thread.sleep(bake * 900);
            synchronized (this) {
                System.out.println("complate preparing");
                System.out.println(orderId + ":" + "baking pizza..");
            }

            int deliver = rand.nextInt(4) + 2;
            Thread.sleep(deliver * 1000);
            synchronized (this) {
                System.out.println("complate baking");
                System.out.println(orderId + ":" + "delevering pizza..");

            }

            synchronized (this) {
                System.out.println("complate delevering..");

            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        


    }
}
