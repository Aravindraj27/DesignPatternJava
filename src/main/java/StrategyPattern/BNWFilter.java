package StrategyPattern;

public class BNWFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Using the B&W Filter");
    }
}
