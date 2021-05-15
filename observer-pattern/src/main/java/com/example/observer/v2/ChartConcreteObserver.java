package com.example.observer.v2;

public class ChartConcreteObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Chart got updated: " + value);
    }
}
