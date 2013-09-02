package com.snippets.designpatterns.behavioral.command.commands;

import com.snippets.designpatterns.behavioral.command.elements.Light;

public class LightToggleCommand implements Command {

    /**
     * The object to execute the command on.
     */
    private Light light;

    public LightToggleCommand(Light light) {
        this.light = light;
    }

    /**
     * Execute the command.
     */
    @Override
    public void execute() {
        light.toggle();
    }
}
