package com.example.strategy.v1;

public class GrayscaleFilterConcreteStrategy implements FilterStrategy {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying Grayscale filter");
    }
}
