package com.example.command.v1.framework;

public class ButtonInvoker {

    private String label;
    private Command command;

    public ButtonInvoker(Command command) {
        this.command = command;
    }

    public void click() {
        // delegating the work to command object
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
