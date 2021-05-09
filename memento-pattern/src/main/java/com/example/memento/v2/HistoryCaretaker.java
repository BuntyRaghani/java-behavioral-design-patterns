package com.example.memento.v2;

import java.util.ArrayList;
import java.util.List;

public class HistoryCaretaker {

    private List<DocumentMemento> states = new ArrayList<>();

    public void push(DocumentMemento documentMemento) {
        states.add(documentMemento);
    }

    public DocumentMemento pop() {
        int lastIndex = states.size() - 1;
        DocumentMemento documentMemento = states.get(lastIndex);
        states.remove(documentMemento);

        return documentMemento;
    }
}
