package design_patterns.abstract_factory;

public class MacOsFactory implements GuiFactory{
    @Override
    public Button creatButton() {
        return new MacOsButton();
    }
}
