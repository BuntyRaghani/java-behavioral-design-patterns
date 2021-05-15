package com.example.observer.v4;

import java.util.ArrayList;
import java.util.List;

public class StockListViewConcreteObserver implements Observer {

    private List<StockConcreteSubject> stockConcreteSubjectList = new ArrayList<>();

    public void addStock(StockConcreteSubject stockConcreteSubject) {
        stockConcreteSubjectList.add(stockConcreteSubject);
        stockConcreteSubject.addObserver(this);
    }

    public void show() {
        System.out.println("Stock List View");
        for (StockConcreteSubject stockConcreteSubject : stockConcreteSubjectList)
            System.out.println(stockConcreteSubject);
    }

    @Override
    public void update() {
        System.out.println("\nPrice Changed - Refreshing StockListView");
        show();
    }
}
