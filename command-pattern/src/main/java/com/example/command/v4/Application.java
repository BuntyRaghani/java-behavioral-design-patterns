package com.example.command.v4;

public class Application {

    public static void main(String[] args) {

        var videoEditor = new VideoEditor();
        var history = new History();

        System.out.println("Initial State: " + videoEditor);

        var setTextConcreteCommand = new SetTextConcreteCommand("Video Title", videoEditor, history);
        setTextConcreteCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new SetContrastConcreteCommand(1, videoEditor, history);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoConcreteCommand = new UndoConcreteCommand(history);
        undoConcreteCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoConcreteCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
