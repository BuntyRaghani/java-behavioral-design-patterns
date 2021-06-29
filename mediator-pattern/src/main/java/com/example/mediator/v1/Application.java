package com.example.mediator.v1;

public class Application {

    public static void main(String[] args) {

        ArticlesDialogBoxConcreteMediator dialogBoxConcreteMediator = new ArticlesDialogBoxConcreteMediator();
        dialogBoxConcreteMediator.simulateUserInteraction1();
        dialogBoxConcreteMediator.simulateUserInteraction2();
        dialogBoxConcreteMediator.simulateUserInteraction3();
    }
}
