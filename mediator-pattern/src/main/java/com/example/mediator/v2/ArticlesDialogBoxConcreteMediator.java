package com.example.mediator.v2;

public class ArticlesDialogBoxConcreteMediator {

    private ListBoxConcreteColleague articlesListBoxConcreteColleague = new ListBoxConcreteColleague();
    private TextBoxConcreteColleague titleTextBoxConcreteColleague = new TextBoxConcreteColleague();
    private ButtonConcreteColleague saveButtonConcreteColleague = new ButtonConcreteColleague();

    public ArticlesDialogBoxConcreteMediator() {

        // Pass an object that implements the observer interface
        // Creating anonymous class instead of standalone implementation because we are going to use it at only single place
        /*articlesListBoxConcreteColleague.attach(new Observer() {
            @Override
            public void update() {
                articleSelected();
            }
        });*/

        // Using lambda we are providing an implementation of functional interface
        //articlesListBoxConcreteColleague.attach(() -> articleSelected());

        // Attaching event handlers. These methods controls the change event of UI control objects
        articlesListBoxConcreteColleague.addEventHandler(this::articleSelected);
        titleTextBoxConcreteColleague.addEventHandler(this::titleChanged);
    }

    private void articleSelected() {
        // Populate title text box with selection from articles list box
        titleTextBoxConcreteColleague.setContent(articlesListBoxConcreteColleague.getSelection());
        // Enable the button
        saveButtonConcreteColleague.setEnabled(true);
    }

    private void titleChanged() {
        // Enable or disable the button depending upon the content of text box
        String content = titleTextBoxConcreteColleague.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        saveButtonConcreteColleague.setEnabled(!isEmpty);
    }

    public void simulateUserInteraction1() {
        articlesListBoxConcreteColleague.setSelection("Article 1");
        System.out.println("TextBox: " + titleTextBoxConcreteColleague.getContent());
        System.out.println("Button: " + saveButtonConcreteColleague.isEnabled());
    }

    public void simulateUserInteraction2() {
        articlesListBoxConcreteColleague.setSelection("Article 1");
        titleTextBoxConcreteColleague.setContent("");
        System.out.println("\nTextBox: " + titleTextBoxConcreteColleague.getContent());
        System.out.println("Button: " + saveButtonConcreteColleague.isEnabled());
    }

    public void simulateUserInteraction3() {
        articlesListBoxConcreteColleague.setSelection("Article 1");
        titleTextBoxConcreteColleague.setContent("");
        titleTextBoxConcreteColleague.setContent("Article 2");
        System.out.println("\nTextBox: " + titleTextBoxConcreteColleague.getContent());
        System.out.println("Button: " + saveButtonConcreteColleague.isEnabled());
    }
}
