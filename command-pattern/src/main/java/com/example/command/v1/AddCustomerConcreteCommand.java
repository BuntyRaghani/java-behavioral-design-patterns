package com.example.command.v1;

import com.example.command.v1.framework.Command;

public class AddCustomerConcreteCommand implements Command {

    private CustomerServiceReceiver customerServiceReceiver;

    public AddCustomerConcreteCommand(CustomerServiceReceiver customerServiceReceiver) {
        this.customerServiceReceiver = customerServiceReceiver;
    }

    @Override
    public void execute() {
        // delegating the work to add customer method of customer service receiver
        customerServiceReceiver.addCustomer();
    }
}
