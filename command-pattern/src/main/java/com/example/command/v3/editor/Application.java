package com.example.command.v3.editor;

public class Application {

    public static void main(String[] args) {
        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello World");

        BoldConcreteCommand boldConcreteCommand = new BoldConcreteCommand(htmlDocument, history);
        boldConcreteCommand.execute();
        System.out.println(htmlDocument.getContent());

        UndoConcreteCommand undoConcreteCommand = new UndoConcreteCommand(history);
        undoConcreteCommand.execute();
        System.out.println(htmlDocument.getContent());
    }
}
