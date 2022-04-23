package StrategyPattern;

public class HCFilter implements Filter{
    @Override
    public void filter(String fileName) {
        System.out.println("Using High contrast filter");
    }
}
