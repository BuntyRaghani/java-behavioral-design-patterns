package com.example.command.v2;

import com.example.command.v2.framework.Command;

public class BlackAndWhiteCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
