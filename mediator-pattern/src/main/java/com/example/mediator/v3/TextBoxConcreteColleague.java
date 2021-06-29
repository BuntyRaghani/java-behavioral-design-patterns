package com.example.mediator.v3;

public class TextBoxConcreteColleague extends UIControlColleague {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }

    public boolean isEmpty() {
        return content == null || content.isEmpty();
    }
}
