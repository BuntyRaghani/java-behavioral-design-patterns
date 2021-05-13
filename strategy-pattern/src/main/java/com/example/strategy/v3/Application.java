package com.example.strategy.v3;

public class Application {

    public static void main(String[] args) {

        // Performing Encryption Using AES
        System.out.println("--------Performing Encryption Using AES--------");
        ChatClientContext chatClientContext = new ChatClientContext(new AESConcreteStrategy());
        chatClientContext.send("Sample Message - 1");

        // Performing Encryption Using DES
        System.out.println("\n--------Performing Encryption Using DES--------");
        ChatClientContext chatClientContext2 = new ChatClientContext(new DESConcreteStrategy());
        chatClientContext2.send("Sample Message - 2");
    }
}
