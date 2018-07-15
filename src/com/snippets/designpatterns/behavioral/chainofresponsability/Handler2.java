package com.snippets.designpatterns.behavioral.chainofresponsability;

/**
 * A handler from the chain.
 */
public class Handler2 extends Handler {

    @Override
    public void handleInput(Input input) {
        System.out.println("Handler2 calling input: " + input);
        input.setParam1(input.getParam1()+input.getParam1());

        if (input.isParam3()) {
            successor.ifPresent(s -> s.handleInput(input));   // calling next successor
        } // otherwise chain stops here
    }
}
