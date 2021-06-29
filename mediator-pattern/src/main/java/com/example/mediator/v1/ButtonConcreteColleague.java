package com.example.mediator.v1;

public class ButtonConcreteColleague extends UIControlColleague {

    private boolean isEnabled;

    public ButtonConcreteColleague(DialogBoxMediator owner) {
        super(owner);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;

        // notifying owner that I am changed
        owner.changed(this);
    }
}
