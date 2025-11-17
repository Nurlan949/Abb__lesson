package pizza_restaurant;

public class PizzaRestaurant {
    public static void main(String[] args) throws InterruptedException {
        PizzaOrder order1 = new PizzaOrder(1);
        PizzaOrder order2 = new PizzaOrder(2);
        PizzaOrder order3 = new PizzaOrder(3);
        PizzaOrder order4 = new PizzaOrder(4);
        PizzaOrder order5 = new PizzaOrder(5);
        order1.start();
        order2.start();
        order3.start();
        order4.start();
        order5.start();

        order1.join();
        order2.join();
        order3.join();
        order4.join();
        order5.join();



    }
}
