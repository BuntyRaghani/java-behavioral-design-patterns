package com.example.command.v3.editor;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    public Deque<UndoableCommand> undoableCommandDeque = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand) {
        undoableCommandDeque.add(undoableCommand);
    }

    public UndoableCommand pop() {
        return undoableCommandDeque.pop();
    }

    public int size() {
        return undoableCommandDeque.size();
    }
}
