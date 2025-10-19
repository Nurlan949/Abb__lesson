package practices_1;

public class Dog {
    private String name;
//    private String color;
    private static String food;
    private int count=0;
    private int age;

    public void eat(){
        System.out.println(food+"="+"yeyir");
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getfood() {
        return food;
    }

    public static void setfood(String food) {
        Dog.food = food;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age,String food) {
        this.name = name;
        this.age = age;
        this.food=food;
    }
    //    static {
//        System.out.println("first static method");
//    }
//
//    {
//        System.out.println("first method");
//    }
//
//    static {
//        System.out.println("second static method");
//
//    }
//
//    {
//        System.out.println("second method");
//
//    }
}
