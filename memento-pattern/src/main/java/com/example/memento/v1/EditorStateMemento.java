package com.example.memento.v1;

public class EditorStateMemento {

    private final String content;

    public EditorStateMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
