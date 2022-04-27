package AbstractFactoryPattern.app;

import AbstractFactoryPattern.WidgetFactory;


public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.creatTextBox().render();
    }
}
