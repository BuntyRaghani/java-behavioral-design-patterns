package com.example.observer.v2;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(int value) {
        for (Observer observer : observerList) {
            observer.update(value);
        }
    }
}
