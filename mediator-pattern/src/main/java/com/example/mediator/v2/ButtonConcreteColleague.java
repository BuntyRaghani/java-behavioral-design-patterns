package com.example.mediator.v2;

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
