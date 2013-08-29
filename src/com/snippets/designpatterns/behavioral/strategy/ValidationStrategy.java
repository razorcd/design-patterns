package com.snippets.designpatterns.behavioral.strategy;

public interface ValidationStrategy {
    boolean isValid(String string);
    String name();
}
