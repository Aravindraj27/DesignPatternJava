package AbstractFactoryPattern.ant;

import AbstractFactoryPattern.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
