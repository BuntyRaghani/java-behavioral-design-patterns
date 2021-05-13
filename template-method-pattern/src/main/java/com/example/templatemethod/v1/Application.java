package com.example.templatemethod.v1;

public class Application {

    public static void main(String[] args) {

        // Executing Transfer Money Task
        System.out.println("--------------Executing Transfer Money Task--------------");
        Task transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();

        // Executing Generate Report Task
        System.out.println("\n--------------Executing Generate Report Task--------------");
        Task generateReportTask = new GenerateReportTask();
        generateReportTask.execute();
    }
}
