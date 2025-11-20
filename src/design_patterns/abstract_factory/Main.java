package design_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        GuiFactory factory=new WindowsFactory();
        Practice practice=new Practice(factory);
        practice.renderUi();

    }
}
