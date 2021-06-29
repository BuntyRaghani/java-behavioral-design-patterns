package com.example.chainofresponsibility.v1;

public class Application {

    public static void main(String[] args) {

        // With this structure we can easily enable, disable or add the new step without modifying the web server code
        // Our system is open for extensions and closed for modifications
        scenario1();
        scenario2();
    }

    private static void scenario1() {

        System.out.println("-------------Scenario 1-------------");

        // authenticator -> logger -> compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        // Valid Request
        webServer.handle(new HttpRequest("admin", "1234"));

        // Invalid Request. Logger and Compressor will not be called
        webServer.handle(new HttpRequest("-", "1234"));
    }

    private static void scenario2() {

        System.out.println("\n-------------Scenario 2-------------");

        // authenticator -> compressor -> encryptor
        Encryptor encryptor = new Encryptor(null);
        Compressor compressor = new Compressor(encryptor);
        Authenticator authenticator = new Authenticator(compressor);

        WebServer webServer = new WebServer(authenticator);
        // Valid Request
        webServer.handle(new HttpRequest("admin", "1234"));

        // Invalid Request. Logger and Compressor will not be called
        webServer.handle(new HttpRequest("-", "1234"));
    }
}
