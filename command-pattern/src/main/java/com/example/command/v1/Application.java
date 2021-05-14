package com.example.command.v1;

import com.example.command.v1.framework.ButtonInvoker;
import com.example.command.v1.framework.Command;

public class Application {

    public static void main(String[] args) {

        CustomerServiceReceiver customerServiceReceiver = new CustomerServiceReceiver();
        Command addCustomerConcreteCommand = new AddCustomerConcreteCommand(customerServiceReceiver);
        ButtonInvoker buttonInvoker = new ButtonInvoker(addCustomerConcreteCommand);

        buttonInvoker.click();
    }
}
