package com.snippets.designpatterns.behavioral.visitor;

public interface Visitor {

    // visitor interface for objects that will be injected in `OldClass` using the `accept(Vitior visitor)` method from `OldClass`
    void visit(IOldClass obj);

}
