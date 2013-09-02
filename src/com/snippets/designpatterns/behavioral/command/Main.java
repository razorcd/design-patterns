package com.snippets.designpatterns.behavioral.command;

import com.snippets.designpatterns.behavioral.command.commands.*;
import com.snippets.designpatterns.behavioral.command.elements.Engine;
import com.snippets.designpatterns.behavioral.command.elements.Light;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        lightOnCommand.execute();

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        lightOffCommand.execute();

        LightToggleCommand lightToggleCommand = new LightToggleCommand(light);
        lightToggleCommand.execute();
        lightToggleCommand.execute();
        lightToggleCommand.execute();


        Engine engine = new Engine();

        EngineStartCommand engineStartCommand = new EngineStartCommand(engine);
        engineStartCommand.execute();
        engineStartCommand.undo();

        EngineStopCommand engineStopCommand = new EngineStopCommand(engine);
        engineStopCommand.execute();
        engineStopCommand.undo();
    }
}
