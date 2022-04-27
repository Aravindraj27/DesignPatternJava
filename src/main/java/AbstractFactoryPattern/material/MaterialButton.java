package AbstractFactoryPattern.material;

import AbstractFactoryPattern.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
