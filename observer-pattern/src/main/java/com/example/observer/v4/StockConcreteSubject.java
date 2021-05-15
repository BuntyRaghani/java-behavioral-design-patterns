package com.example.observer.v4;

public class StockConcreteSubject extends Subject {

    private String symbol;
    private float price;

    public StockConcreteSubject(String symbol, float price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "StockConcreteSubject{" +
                "symbol='" + symbol + '\'' +
                ", price=" + price +
                '}';
    }
}
