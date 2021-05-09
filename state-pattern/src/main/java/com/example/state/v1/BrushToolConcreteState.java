package com.example.state.v1;

public class BrushToolConcreteState implements ToolState {

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }

}
