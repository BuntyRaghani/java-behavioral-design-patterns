package com.example.memento.v2;

public class Application {

    public static void main(String[] args) {

        DocumentOriginator documentOriginator = new DocumentOriginator();
        HistoryCaretaker historyCaretaker = new HistoryCaretaker();

        documentOriginator.setContent("Demo Content");
        historyCaretaker.push(documentOriginator.createState());
        System.out.println("State after first edit: " + documentOriginator);

        documentOriginator.setFontName("Font 1");
        historyCaretaker.push(documentOriginator.createState());
        System.out.println("State after second edit: " + documentOriginator);

        documentOriginator.setFontSize(10.5);
        System.out.println("State after third edit: " + documentOriginator);

        documentOriginator.restore(historyCaretaker.pop());
        System.out.println("State after first restore: " + documentOriginator);

        documentOriginator.restore(historyCaretaker.pop());
        System.out.println("State after second restore: " + documentOriginator);

    }
}
