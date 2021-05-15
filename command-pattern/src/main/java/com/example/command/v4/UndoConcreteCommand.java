package com.example.command.v4;

public class UndoConcreteCommand implements Command {

    private History history;

    public UndoConcreteCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0) {
            history.pop().unexecute();
        }
    }
}
