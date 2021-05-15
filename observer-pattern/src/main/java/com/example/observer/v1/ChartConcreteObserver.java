package com.example.observer.v1;

public class ChartConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("Chart got updated.");
    }
}
