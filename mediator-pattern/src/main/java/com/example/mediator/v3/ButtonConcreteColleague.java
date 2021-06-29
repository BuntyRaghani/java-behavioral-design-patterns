package com.example.mediator.v3;

public class ButtonConcreteColleague extends UIControlColleague {

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
