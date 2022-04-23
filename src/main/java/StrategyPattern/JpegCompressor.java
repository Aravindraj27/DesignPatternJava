package StrategyPattern;

public class JpegCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using Jpeg");
    }
}
