package com.example.observer.v1;

public class Application {

    public static void main(String[] args) {

        DataSourceConcreteSubject dataSourceConcreteSubject = new DataSourceConcreteSubject();
        Observer spreadSheet1 = new SpreadSheetConcreteObserver();
        Observer spreadSheet2 = new SpreadSheetConcreteObserver();
        Observer chart = new ChartConcreteObserver();

        // Register objects as observers
        dataSourceConcreteSubject.addObserver(spreadSheet1);
        dataSourceConcreteSubject.addObserver(spreadSheet2);
        dataSourceConcreteSubject.addObserver(chart);

        // All observers will be notified
        dataSourceConcreteSubject.setValue(1);

    }
}
