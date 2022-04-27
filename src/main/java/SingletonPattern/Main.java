package SingletonPattern;

public class Main {
    public static void main(String args[]) {
        ConfigManager configManager = ConfigManager.getInstance();
        configManager.set("Bulgogi", "Korean Dish");


        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("Bulgogi"));
    }
}
