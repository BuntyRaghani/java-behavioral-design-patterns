package com.example.memento.v1;

public class Application {

    public static void main(String[] args) {

        EditorOriginator editorOriginator = new EditorOriginator();
        HistoryCaretaker historyCaretaker = new HistoryCaretaker();

        editorOriginator.setContent("A");
        historyCaretaker.push(editorOriginator.createState());
        System.out.println("State after first edit: " + editorOriginator.getContent());

        editorOriginator.setContent("B");
        historyCaretaker.push(editorOriginator.createState());
        System.out.println("State after second edit: " + editorOriginator.getContent());

        editorOriginator.setContent("C");
        historyCaretaker.push(editorOriginator.createState());
        System.out.println("State after third edit: " + editorOriginator.getContent());

        editorOriginator.setContent("D");
        System.out.println("State after fourth edit: " + editorOriginator.getContent());

        editorOriginator.restore(historyCaretaker.pop());
        System.out.println("Final state after restore: " + editorOriginator.getContent());

    }
}
