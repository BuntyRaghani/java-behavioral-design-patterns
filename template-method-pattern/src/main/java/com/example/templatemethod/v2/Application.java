package com.example.templatemethod.v2;

public class Application {

    public static void main(String[] args) {

        // Closing Chat Window
        System.out.println("-------------Closing Chat Window-------------");
        Window chatWindow = new ChatWindow();
        chatWindow.close();

        // Closing Browser Window
        System.out.println("\n-------------Closing Browser Window-------------");
        Window browserWindow = new BrowserWindow();
        browserWindow.close();
    }
}
