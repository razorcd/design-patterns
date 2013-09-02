package com.snippets.designpatterns.behavioral.command.commands;

import com.snippets.designpatterns.behavioral.command.elements.Light;

public class LightOnCommand implements Command {

    /**
     * The object to execute the command on.
     */
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * Execute the command.
     */
    @Override
    public void execute() {
        light.on();
    }
}
