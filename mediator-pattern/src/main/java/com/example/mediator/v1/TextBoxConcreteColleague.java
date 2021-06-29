package com.example.mediator.v1;

public class TextBoxConcreteColleague extends UIControlColleague {

    private String content;

    public TextBoxConcreteColleague(DialogBoxMediator owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        // notifying owner that I am changed
        owner.changed(this);
    }
}
