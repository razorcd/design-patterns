package com.snippets.designpatterns.behavioral.command.commands;

import com.snippets.designpatterns.behavioral.command.elements.Engine;

public class EngineStartCommand implements Command, UndoCommand {

    /**
     * The object to execute the command on.
     */
    private Engine engine;

    public EngineStartCommand(Engine engine) {
        this.engine = engine;
    }

    /**
     * Execute the command.
     */
    @Override
    public void execute() {
        engine.start();
    }


    @Override
    public void undo() {
        engine.stop();

    }
}
