package com.snippets.designpatterns.behavioral.visitor;

public class OldClass1 implements IOldClass {

    private int value;

    public OldClass1(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    // adds visitor pattern
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
