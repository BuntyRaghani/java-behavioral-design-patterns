package com.example.command.v2;

public class Application {

    public static void main(String[] args) {

        CompositeConcreteCommand compositeConcreteCommand = new CompositeConcreteCommand();
        compositeConcreteCommand.add(new ResizeConcreteCommand());
        compositeConcreteCommand.add(new BlackAndWhiteCommand());

        compositeConcreteCommand.execute();
    }
}
