package com.example.strategy.v2;

public class ImageStorageContext {

    public void store(String fileName, CompressorStrategy compressorStrategy, FilterStrategy filterStrategy) {
        compressorStrategy.compress(fileName);
        filterStrategy.apply(fileName);
    }
}
