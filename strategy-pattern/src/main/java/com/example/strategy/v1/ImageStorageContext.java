package com.example.strategy.v1;

public class ImageStorageContext {

    private CompressorStrategy compressorStrategy;
    private FilterStrategy filterStrategy;

    public ImageStorageContext(CompressorStrategy compressorStrategy, FilterStrategy filterStrategy) {
        this.compressorStrategy = compressorStrategy;
        this.filterStrategy = filterStrategy;
    }

    public void store(String fileName) {
        compressorStrategy.compress(fileName);
        filterStrategy.apply(fileName);
    }
}
