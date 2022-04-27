package AbstractFactoryPattern.material;

import AbstractFactoryPattern.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
