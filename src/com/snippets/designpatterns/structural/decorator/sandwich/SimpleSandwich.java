package com.snippets.designpatterns.structural.decorator.sandwich;

import com.snippets.designpatterns.structural.decorator.sandwich.Sandwich;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Simple sandwich";
    }
}
