package com.snippets.designpatterns.behavioral.command.elements;

public class Light {

    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("Light on.");
    }

    public void off() {
        isOn = false;
        System.out.println("Light off.");
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }
}
