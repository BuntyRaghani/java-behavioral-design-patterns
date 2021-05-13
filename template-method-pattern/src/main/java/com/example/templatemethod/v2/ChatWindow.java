package com.example.templatemethod.v2;

public class ChatWindow extends Window {

    @Override
    protected void afterClosing() {
        System.out.println("Activity After Closing the Chat Window");
    }
}
