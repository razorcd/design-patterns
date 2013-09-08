package com.snippets.designpatterns.behavioral.visitor;

public interface IOldClass {

    int getValue();


    //Adding visitor pattern
    void accept(Visitor visitor);
}
