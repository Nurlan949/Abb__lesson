package design_patterns.abstract_factory;

public class Practice {
    private Button button;
public Practice(GuiFactory factory){
    button=factory.creatButton();
}
public void renderUi(){
    button.render();
}


}
