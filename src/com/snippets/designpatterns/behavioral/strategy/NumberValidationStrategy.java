package com.snippets.designpatterns.behavioral.strategy;

public class NumberValidationStrategy implements ValidationStrategy {

    @Override
    public boolean isValid(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String name() {
        return "NUMBER";
    }
}
