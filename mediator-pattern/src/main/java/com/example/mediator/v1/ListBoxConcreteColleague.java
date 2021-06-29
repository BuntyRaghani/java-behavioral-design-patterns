package com.example.mediator.v1;

public class ListBoxConcreteColleague extends UIControlColleague {

    private String Selection;

    public ListBoxConcreteColleague(DialogBoxMediator owner) {
        super(owner);
    }

    public String getSelection() {
        return Selection;
    }

    public void setSelection(String selection) {
        Selection = selection;

        // notifying owner that I am changed
        owner.changed(this);
    }
}
