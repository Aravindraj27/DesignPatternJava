package StrategyPattern;

public class Main {
    public static void main(String args[]) {
        ImageStorage imageStorage = new ImageStorage(new PNGCompressor(), new HCFilter());
        imageStorage.store("Bulgogi");
    }
}
