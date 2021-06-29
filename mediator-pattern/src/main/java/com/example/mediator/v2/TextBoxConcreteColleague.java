package com.example.mediator.v2;

public class TextBoxConcreteColleague extends UIControlColleague {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
