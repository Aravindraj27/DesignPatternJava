package AbstractFactoryPattern.ant;

import AbstractFactoryPattern.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
