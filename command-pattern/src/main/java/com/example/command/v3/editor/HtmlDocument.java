package com.example.command.v3.editor;

public class HtmlDocument {

    private String content;

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
