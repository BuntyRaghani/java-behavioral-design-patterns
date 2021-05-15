package com.example.observer.v3;

public class Application {

    public static void main(String[] args) {

        DataSourceConcreteSubject dataSourceConcreteSubject = new DataSourceConcreteSubject();
        Observer spreadSheet1 = new SpreadSheetConcreteObserver(dataSourceConcreteSubject);
        Observer spreadSheet2 = new SpreadSheetConcreteObserver(dataSourceConcreteSubject);
        Observer chart = new ChartConcreteObserver(dataSourceConcreteSubject);

        // Register objects as observers
        dataSourceConcreteSubject.addObserver(spreadSheet1);
        dataSourceConcreteSubject.addObserver(spreadSheet2);
        dataSourceConcreteSubject.addObserver(chart);

        // All observers will be notified
        dataSourceConcreteSubject.setValue(1);

    }
}
