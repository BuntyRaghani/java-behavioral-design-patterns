package com.example.command.v2;

import com.example.command.v2.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeConcreteCommand implements Command {

    private List<Command> commandList = new ArrayList<>();

    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }
    }
}
