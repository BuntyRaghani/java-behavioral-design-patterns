package com.example.command.v4;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> undoableCommandDeque = new ArrayDeque<>();

    public void push(UndoableCommand undoableCommand) {
        undoableCommandDeque.push(undoableCommand);
    }

    public UndoableCommand pop() {
        return undoableCommandDeque.pop();
    }

    public int size() {
        return undoableCommandDeque.size();
    }
}
