package com.snippets.designpatterns.behavioral.memento;

import java.util.Stack;

/**
 * Stores Element objects
 */
public class Caretaker {

    private final Stack<Element> history = new Stack<>();

    /**
     * Stores new element
     * @param el the Element to store
     */
    public void save(final Element el) {
        history.push(el.save());
    }

    /**
     * Reverts state of Element object to last stored Element
     * @param el the Element to revert
     */
    public void revert(Element el) {
        el.revert(history.pop());
    }
}
