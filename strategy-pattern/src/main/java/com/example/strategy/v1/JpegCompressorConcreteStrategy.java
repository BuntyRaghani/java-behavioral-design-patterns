package com.example.strategy.v1;

public class JpegCompressorConcreteStrategy implements CompressorStrategy {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
