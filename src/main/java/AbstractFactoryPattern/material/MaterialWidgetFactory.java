package AbstractFactoryPattern.material;

import AbstractFactoryPattern.Button;
import AbstractFactoryPattern.TextBox;
import AbstractFactoryPattern.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox creatTextBox() {
        return new MaterialTextBox();
    }
}
