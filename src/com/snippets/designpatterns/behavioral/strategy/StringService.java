package com.snippets.designpatterns.behavioral.strategy;

public class StringService {

    private ValidationStrategy validationStrategy;

    public StringService(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public void update(String string) {
        if (validationStrategy.isValid(string)) {
            System.out.println(string + " is a valid "+validationStrategy.name()+" and updating ...");
        } else {
            System.out.println(string + " is an invalid "+validationStrategy.name()+" and not updating.");
        }

    }


}
