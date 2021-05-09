package com.example.state.v1;

public class CanvasContext {

    private ToolState currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public ToolState getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolState currentTool) {
        this.currentTool = currentTool;
    }
}
