package com.snippets.designpatterns.behavioral.interpreter;

public interface Expression {
    /**
     * The parameters to use for interpreter. In this case the string tokens to look for.
     * @param interpretParams params as array of string tokens
     * @return if any string token found in context
     */
    boolean interpret(String[] interpretParams);
}
