package bus_simulation;

public class Passenger {
    private String name;
    private boolean isPriority = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public Passenger(String name, boolean isPriority) {
        this.name = name;
        this.isPriority = isPriority;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + (isPriority ? "(PRIORITY)" : "");
    }
    
}
