package com.snippets.designpatterns.structural.decorator.sandwichdecorators;

import com.snippets.designpatterns.structural.decorator.sandwich.Sandwich;

/**
 * Base class to create different decorators.
 */
public abstract class SandwichDecorator implements Sandwich {

    // the object to decorate
    protected Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();
    }
}
