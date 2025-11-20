package design_patterns.singleton;

public enum SingletonEnum {
    INSTANCE {
        @Override
        public void doCalculation(int a, int b) {
        }
    };
    public abstract void doCalculation(int a,int b);


}
