package com.example.chainofresponsibility.v1;

public class Encryptor extends Handler {

    public Encryptor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {

        System.out.println("Encryption");

        return false;
    }
}