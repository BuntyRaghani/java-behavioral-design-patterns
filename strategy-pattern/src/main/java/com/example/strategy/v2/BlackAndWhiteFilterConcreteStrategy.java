package com.example.strategy.v2;

public class BlackAndWhiteFilterConcreteStrategy implements FilterStrategy {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
