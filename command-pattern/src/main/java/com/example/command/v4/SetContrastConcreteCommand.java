package com.example.command.v4;

public class SetContrastConcreteCommand implements UndoableCommand {

    private float contrast;
    private float previousContrast;
    private VideoEditor videoEditor;
    private History history;

    public SetContrastConcreteCommand(float contrast, VideoEditor videoEditor, History history) {
        this.contrast = contrast;
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContrast = videoEditor.getContrast();
        videoEditor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(previousContrast);
    }
}
