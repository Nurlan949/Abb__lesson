package design_patterns.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("windows button render");
    }

    @Override
    public void onClick() {
        System.out.println("windows button click");
    }
}
