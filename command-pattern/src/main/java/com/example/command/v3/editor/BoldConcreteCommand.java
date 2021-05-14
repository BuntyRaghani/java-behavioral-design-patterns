package com.example.command.v3.editor;

public class BoldConcreteCommand implements UndoableCommand {

    private String previousContent;
    private HtmlDocument htmlDocument;
    private History history;

    public BoldConcreteCommand(HtmlDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(previousContent);
    }
}
