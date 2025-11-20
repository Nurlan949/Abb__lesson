package design_patterns.singleton;

public class Singleton {
    //Eager initialization
    //yol 1
    public static Singleton INSTANCE_STATIC = new Singleton();
    //yol 2
    //lazy initialization
    private volatile static Singleton INSTANCE_WITH_LOCK;
    //yol 3
    //HOLDER
    //lazy initialization
    private static Singleton INSTANCE_WITH_HOLDER;

    //YOL 2
    public static Singleton getInstance() {
        if (INSTANCE_WITH_LOCK == null) {
            synchronized (Singleton.class) {
                if (INSTANCE_WITH_LOCK == null) {
                    INSTANCE_WITH_LOCK = new Singleton();
                }
                return INSTANCE_WITH_LOCK;
            }
        }
        return INSTANCE_WITH_LOCK;
    }

    //YOL 1
    public static void doCalculation(int a, int b) {
        System.out.println(a + b + "=" + (a + b));
    }

    private Singleton() {

    }

    public static class HOLDER {
        private static final Singleton INSTANCE = new Singleton();

        private HOLDER() {
        }

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }
}
