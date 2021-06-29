package com.example.mediator.v3;

public class CheckBoxConcreteColleague extends UIControlColleague {

    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }
}
