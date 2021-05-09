package com.example.memento.v1;

public class EditorOriginator {

    private String content;

    public EditorStateMemento createState() {
        return new EditorStateMemento(content);
    }

    public void restore(EditorStateMemento editorStateMemento) {
        this.content = editorStateMemento.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
