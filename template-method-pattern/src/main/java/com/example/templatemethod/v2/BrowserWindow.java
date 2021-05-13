package com.example.templatemethod.v2;

public class BrowserWindow extends Window {

    @Override
    protected void beforeClosing() {
        System.out.println("Activity Before Closing the Browser Window");
    }

    @Override
    protected void afterClosing() {
        System.out.println("Activity After Closing the Browser Window");
    }
}
