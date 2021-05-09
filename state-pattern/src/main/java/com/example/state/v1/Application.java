package com.example.state.v1;

public class Application {

    public static void main(String[] args) {

        CanvasContext canvasContext = new CanvasContext();

        // Selection Tool
        System.out.println("-------Selection Tool-------");
        canvasContext.setCurrentTool(new SelectionToolConcreteState());
        canvasContext.mouseDown();
        canvasContext.mouseUp();

        // Eraser Tool
        System.out.println("\n-------Eraser Tool-------");
        canvasContext.setCurrentTool(new EraserToolConcreteState());
        canvasContext.mouseDown();
        canvasContext.mouseUp();

        // Brush Tool
        System.out.println("\n-------Brush Tool-------");
        canvasContext.setCurrentTool(new BrushToolConcreteState());
        canvasContext.mouseDown();
        canvasContext.mouseUp();
    }
}
