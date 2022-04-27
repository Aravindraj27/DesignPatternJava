package AbstractFactoryPattern;

import AbstractFactoryPattern.ant.AntWidgetFactory;
import AbstractFactoryPattern.app.ContactForm;
import AbstractFactoryPattern.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new AntWidgetFactory());
    }
}
