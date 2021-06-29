package com.example.chainofresponsibility.v2;

public abstract class DataReader {

    private DataReader next;

    public void setNext(DataReader next) {
        this.next = next;
    }

    public void read(String fileName) {

        if (fileName.endsWith(getExtension())) {
            this.doRead(fileName);
            return;
        }

        if (next != null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File format not supported.");

    }

    protected abstract void doRead(String fileName);

    protected abstract String getExtension();
}
