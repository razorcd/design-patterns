package com.snippets.designpatterns.behavioral.strategy;

public class DateValidationStrategy implements ValidationStrategy {

    @Override
    public boolean isValid(String string) {
        return string.matches("[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}");
    }

    @Override
    public String name() {
        return "DATE";
    }
}
