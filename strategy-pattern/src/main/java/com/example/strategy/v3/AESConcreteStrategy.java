package com.example.strategy.v3;

public class AESConcreteStrategy implements EncryptionAlgorithmStrategy {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES");
    }
}
