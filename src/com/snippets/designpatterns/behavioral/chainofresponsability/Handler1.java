package com.snippets.designpatterns.behavioral.chainofresponsability;

/**
 * A handler from the chain.
 */
public class Handler1 extends Handler {

    @Override
    public void handleInput(Input input) {
        System.out.println("Handler1 calling input: " + input);
        input.setParam1(input.getParam1()+input.getParam1());
        successor.ifPresent(s -> s.handleInput(input));   // calling next successor
    }
}
