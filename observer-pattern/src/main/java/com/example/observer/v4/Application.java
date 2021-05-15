package com.example.observer.v4;

public class Application {

    public static void main(String[] args) {

        var statusBar = new StatusBarConcreteObserver();
        var stockListView = new StockListViewConcreteObserver();

        var stock1 = new StockConcreteSubject("stock1", 10);
        var stock2 = new StockConcreteSubject("stock2", 20);
        var stock3 = new StockConcreteSubject("stock3", 30);

        // The status bar shows the popular stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // The stock view list shows all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // Causes both statusBar and stockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar is not watching this stock.)
        stock3.setPrice(9);

    }
}
