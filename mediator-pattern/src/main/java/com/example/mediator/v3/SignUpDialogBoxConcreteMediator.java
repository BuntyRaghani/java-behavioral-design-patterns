package com.example.mediator.v3;

public class SignUpDialogBoxConcreteMediator {

    private TextBoxConcreteColleague usernameTextBox = new TextBoxConcreteColleague();
    private TextBoxConcreteColleague passwordTextBox = new TextBoxConcreteColleague();
    private CheckBoxConcreteColleague termsCheckBox = new CheckBoxConcreteColleague();
    private ButtonConcreteColleague signUpButton = new ButtonConcreteColleague();

    public SignUpDialogBoxConcreteMediator() {

        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        termsCheckBox.addEventHandler(this::controlChanged);
    }

    private void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && termsCheckBox.isChecked();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUpButton.isEnabled());

        // The user enters their username, the button is still disabled
        usernameTextBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordTextBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        termsCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }
}
