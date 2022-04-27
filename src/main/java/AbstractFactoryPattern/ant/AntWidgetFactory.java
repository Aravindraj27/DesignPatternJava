package AbstractFactoryPattern.ant;

import AbstractFactoryPattern.Button;
import AbstractFactoryPattern.TextBox;
import AbstractFactoryPattern.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox creatTextBox() {
        return new AntTextBox();
    }
}
