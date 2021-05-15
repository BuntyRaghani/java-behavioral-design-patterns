package com.example.observer.v2;

public class SpreadSheetConcreteObserver implements Observer {

    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got notified: " + value);
    }
}
