package com.snippets.designpatterns.behavioral.visitor;

/**
 * Implementation of a visitor that is injected in OldClass.
 */
public class SmallerThanVisitor implements Visitor {

    private double limit;

    public SmallerThanVisitor(double limit) {
        this.limit = limit;
    }

    @Override
    public void visit(IOldClass obj) {
        boolean smallerThan = obj.getValue() < limit;
        System.out.println("Value " + obj.getValue() + " for " + obj.getClass().getSimpleName() + " smaller than " + limit + " : " + smallerThan);
    }
}
