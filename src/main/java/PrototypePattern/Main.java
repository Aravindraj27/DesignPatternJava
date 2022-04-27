package PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Component component = new Square();
        component.render();
        component.clone();
    }
}
