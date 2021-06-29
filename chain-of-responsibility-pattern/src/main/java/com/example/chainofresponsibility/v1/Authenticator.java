package com.example.chainofresponsibility.v1;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = (request.getUsername().equals("admin") && request.getPassword().equals("1234"));

        System.out.println("\nAuthentication");

        // Return false if request is a valid request so that the next handler in the chain can be called
        // False denotes that we have not completed the request processing, call the next handler
        return !isValid;
    }
}
