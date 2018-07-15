package com.snippets.designpatterns.behavioral.chainofresponsability;

import java.util.Optional;

/**
 * All chain classes must extend this class
 */
public abstract class Handler {

    /**
     * Holds the next handler that will be called after this one is processed.
     * Link list structure.
     */
    protected Optional<Handler> successor = Optional.empty();

    public void setSuccessor(Handler successor) {
        this.successor = Optional.of(successor);
    }

    public abstract void handleInput(Input input);
}
