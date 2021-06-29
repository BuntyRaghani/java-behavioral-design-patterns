package com.example.chainofresponsibility.v2;


public class Application {

    public static void main(String[] args) {

        DataReader reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
    }
}
