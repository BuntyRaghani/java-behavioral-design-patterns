package com.example.mediator.v3;

public class Application {

    public static void main(String[] args) {

        SignUpDialogBoxConcreteMediator signUpDialogBoxConcreteMediator = new SignUpDialogBoxConcreteMediator();
        signUpDialogBoxConcreteMediator.simulateUserInteraction();
    }
}
