package com.example.observer.v3;

public class SpreadSheetConcreteObserver implements Observer {

    private DataSourceConcreteSubject dataSourceConcreteSubject;

    public SpreadSheetConcreteObserver(DataSourceConcreteSubject dataSourceConcreteSubject) {
        this.dataSourceConcreteSubject = dataSourceConcreteSubject;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: " + dataSourceConcreteSubject.getValue());
    }
}
