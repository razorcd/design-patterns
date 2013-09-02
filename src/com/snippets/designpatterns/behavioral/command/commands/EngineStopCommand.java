package com.snippets.designpatterns.behavioral.command.commands;

import com.snippets.designpatterns.behavioral.command.elements.Engine;

public class EngineStopCommand implements Command, UndoCommand {

    /**
     * The object to execute the command on.
     */
    private Engine engine;

    public EngineStopCommand(Engine engine) {
        this.engine = engine;
    }

    /**
     * Execute the command.
     */
    @Override
    public void execute() {
        engine.stop();
    }

    @Override
    public void undo() {
        engine.start();
    }
}
