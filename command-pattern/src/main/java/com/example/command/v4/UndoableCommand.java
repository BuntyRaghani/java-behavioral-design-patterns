package com.example.command.v4;

public interface UndoableCommand extends Command {

    void unexecute();
}
