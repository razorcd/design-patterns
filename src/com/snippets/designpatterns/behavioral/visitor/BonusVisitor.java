package com.snippets.designpatterns.behavioral.visitor;

/**
 * Implementation of a visitor that is injected in OldClass.
 */
public class BonusVisitor implements Visitor {

    private double bonusMultiplier;

    public BonusVisitor(double bonusMultiplier) {
        this.bonusMultiplier = bonusMultiplier;
    }

    @Override
    public void visit(IOldClass obj) {
        System.out.println("Value " + obj.getValue() + " with bonus for " + obj.getClass().getSimpleName() + " is " + obj.getValue()*bonusMultiplier);
    }
}
