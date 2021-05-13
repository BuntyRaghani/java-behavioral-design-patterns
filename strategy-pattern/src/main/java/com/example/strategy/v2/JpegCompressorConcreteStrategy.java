package com.example.strategy.v2;

public class JpegCompressorConcreteStrategy implements CompressorStrategy {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
