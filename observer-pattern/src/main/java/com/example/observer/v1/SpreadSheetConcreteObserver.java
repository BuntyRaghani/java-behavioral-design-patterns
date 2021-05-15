package com.example.observer.v1;

public class SpreadSheetConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified.");
    }
}
