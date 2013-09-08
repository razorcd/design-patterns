package com.snippets.designpatterns.behavioral.visitor;

public class OldClass2 implements IOldClass {

    private int value;

    public OldClass2(int value) {
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
