package com.example.chainofresponsibility.v2;

public class DataReaderFactory {

    public static DataReader getDataReaderChain() {
        ExcelReader excelReader = new ExcelReader();
        NumbersReader numbersReader = new NumbersReader();
        QuickBooksReader quickBooksReader = new QuickBooksReader();

        quickBooksReader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        return quickBooksReader;
    }
}
