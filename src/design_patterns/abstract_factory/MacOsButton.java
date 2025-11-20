package design_patterns.abstract_factory;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("macOs button render");
    }

    @Override
    public void onClick() {
        System.out.println("macOs button click");
    }
}
