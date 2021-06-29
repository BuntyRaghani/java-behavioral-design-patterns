package com.example.mediator.v2;

public class ListBoxConcreteColleague extends UIControlColleague {

    private String Selection;

    public String getSelection() {
        return Selection;
    }

    public void setSelection(String selection) {
        Selection = selection;
        notifyEventHandlers();
    }
}
