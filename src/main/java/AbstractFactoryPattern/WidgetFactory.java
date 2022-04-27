package AbstractFactoryPattern;

import AbstractFactoryPattern.app.ContactForm;

public interface WidgetFactory {
    Button createButton();
    TextBox creatTextBox();
}
