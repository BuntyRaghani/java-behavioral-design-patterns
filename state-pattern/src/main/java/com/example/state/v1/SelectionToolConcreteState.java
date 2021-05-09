package com.example.state.v1;

public class SelectionToolConcreteState implements ToolState {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
