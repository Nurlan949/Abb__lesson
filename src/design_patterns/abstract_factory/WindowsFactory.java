package design_patterns.abstract_factory;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button creatButton() {
        return new WindowsButton();
    }

}
