package com.example.mediator.v1;

// We can also use interface here since we only have one abstract method
// In real world applications, this class will provide some default implementations as well due to which we are keeping it as an abstract class
public abstract class DialogBoxMediator {

    public abstract void changed(UIControlColleague uiControlColleague);
}
