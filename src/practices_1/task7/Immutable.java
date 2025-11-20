package practices_1.task7;

public final class Immutable {
    private final String name;
    private final int age;

    private Immutable(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static Immutable of(String name,int age){
        return new Immutable(name,age);
    }
}
