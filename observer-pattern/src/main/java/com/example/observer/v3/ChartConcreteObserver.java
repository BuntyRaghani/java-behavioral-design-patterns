package com.example.observer.v3;

public class ChartConcreteObserver implements Observer {

    private DataSourceConcreteSubject dataSourceConcreteSubject;

    public ChartConcreteObserver(DataSourceConcreteSubject dataSourceConcreteSubject) {
        this.dataSourceConcreteSubject = dataSourceConcreteSubject;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated: " + dataSourceConcreteSubject.getValue());
    }
}
