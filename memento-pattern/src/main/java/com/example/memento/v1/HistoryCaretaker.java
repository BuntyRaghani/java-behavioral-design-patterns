package com.example.memento.v1;

import java.util.ArrayList;
import java.util.List;

public class HistoryCaretaker {
    private List<EditorStateMemento> states = new ArrayList<>();

    public void push(EditorStateMemento editorStateMemento) {
        states.add(editorStateMemento);
    }

    public EditorStateMemento pop() {
        int lastIndex = states.size() - 1;
        EditorStateMemento lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }

}
