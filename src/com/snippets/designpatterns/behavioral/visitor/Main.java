package com.snippets.designpatterns.behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        IOldClass oldClass1 = new OldClass1(5);
        IOldClass oldClass2 = new OldClass2(10);

        BonusVisitor bonusVisitor = new BonusVisitor(1.3);

        oldClass1.accept(bonusVisitor);
        oldClass2.accept(bonusVisitor);

        SmallerThanVisitor smallerThanVisitor = new SmallerThanVisitor(8);

        oldClass1.accept(smallerThanVisitor);
        oldClass2.accept(smallerThanVisitor);

    }

}
