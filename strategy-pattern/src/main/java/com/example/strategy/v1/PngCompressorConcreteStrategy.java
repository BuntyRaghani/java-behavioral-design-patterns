package com.example.strategy.v1;

public class PngCompressorConcreteStrategy implements CompressorStrategy {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }
}
