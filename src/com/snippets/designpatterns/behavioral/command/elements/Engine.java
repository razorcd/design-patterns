package com.snippets.designpatterns.behavioral.command.elements;

public class Engine {

    private boolean isOn = false;

    public void start() {
        isOn = true;
        System.out.println("Engine started.");
    }

    public void stop() {
        isOn = false;
        System.out.println("Engine stopped.");
    }
}
