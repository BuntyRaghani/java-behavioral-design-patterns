package com.example.strategy.v3;

public class ChatClientContext {

    private EncryptionAlgorithmStrategy encryptionAlgorithmStrategy;

    public ChatClientContext(EncryptionAlgorithmStrategy encryptionAlgorithmStrategy) {
        this.encryptionAlgorithmStrategy = encryptionAlgorithmStrategy;
    }

    public void send(String message) {
        encryptionAlgorithmStrategy.encrypt(message);

        System.out.println("Sending the encrypted message...");
    }
}
