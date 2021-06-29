package com.example.mediator.v1;

public class ArticlesDialogBoxConcreteMediator extends DialogBoxMediator {

    // Pass the dialog box object that own these objects which in this case is current object i.e this
    private ListBoxConcreteColleague articlesListBoxConcreteColleague = new ListBoxConcreteColleague(this);
    private TextBoxConcreteColleague titleTextBoxConcreteColleague = new TextBoxConcreteColleague(this);
    private ButtonConcreteColleague saveButtonConcreteColleague = new ButtonConcreteColleague(this);

    @Override
    public void changed(UIControlColleague uiControlColleague) {

        // Figure our whose control is changed
        if (uiControlColleague == articlesListBoxConcreteColleague) {
            articleSelected();
        } else if (uiControlColleague == titleTextBoxConcreteColleague) {
            titleChanged();
        }
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
