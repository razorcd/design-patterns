package com.snippets.designpatterns.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        ValidationStrategy dateValidator = new DateValidationStrategy();

        StringService dateStringService = new StringService(dateValidator);
        dateStringService.update("1990-11-1");

        ValidationStrategy numberValidator = new NumberValidationStrategy();

        StringService numberStringService = new StringService(numberValidator);
        numberStringService.update("1234567");
        numberStringService.update("F36F3EA");
    }
}
