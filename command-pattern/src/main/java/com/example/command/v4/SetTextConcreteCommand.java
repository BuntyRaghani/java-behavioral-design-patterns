package com.example.command.v4;

public class SetTextConcreteCommand implements UndoableCommand {

    private String text;
    private String previousText;
    private VideoEditor videoEditor;
    private History history;

    public SetTextConcreteCommand(String text, VideoEditor videoEditor, History history) {
        this.text = text;
        this.videoEditor = videoEditor;
        this.history = history;
    }

    @Override
    public void execute() {
        previousText = videoEditor.getText();
        videoEditor.setText(text);
        history.push(this);
    }

    @Override
    public void unexecute() {
        videoEditor.setText(previousText);
    }
}
