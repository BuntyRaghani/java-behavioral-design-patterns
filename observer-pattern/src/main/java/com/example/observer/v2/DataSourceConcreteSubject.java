package com.example.observer.v2;

public class DataSourceConcreteSubject extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;

        // Push style of communication
        notifyObservers(value);
    }
}
