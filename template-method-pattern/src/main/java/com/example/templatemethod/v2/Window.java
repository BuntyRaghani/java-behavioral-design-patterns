package com.example.templatemethod.v2;

public class Window {

    public void close() {
        beforeClosing();

        System.out.println("Removing the window from the screen");

        afterClosing();
    }

    protected void beforeClosing() {
    }

    protected void afterClosing() {
    }

}
