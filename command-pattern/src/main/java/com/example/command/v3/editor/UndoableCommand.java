package com.example.command.v3.editor;

public interface UndoableCommand extends Command {

    void unexecute();
}
