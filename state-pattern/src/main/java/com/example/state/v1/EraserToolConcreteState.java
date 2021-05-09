package com.example.state.v1;

public class EraserToolConcreteState implements ToolState {

    @Override
    public void mouseDown() {
        System.out.println("Eraser icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }

}
