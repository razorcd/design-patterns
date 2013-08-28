package com.snippets.designpatterns.structural.decorator.sandwichdecorators;

import com.snippets.designpatterns.structural.decorator.sandwich.Sandwich;

public class MeatSandwichDecorator extends SandwichDecorator {

    private String meat;

    public MeatSandwichDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public MeatSandwichDecorator(Sandwich sandwich, String meat) {
        super(sandwich);
        this.meat = meat;
    }

    @Override
    public String make() {
        return sandwich.make() + " with " + getMeat();
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
