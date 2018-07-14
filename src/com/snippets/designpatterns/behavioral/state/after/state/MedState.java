package com.snippets.designpatterns.behavioral.state.after.state;

import com.snippets.designpatterns.behavioral.state.after.Fan;

public class MedState extends State {

    public MedState(Fan fan) {
        this.fan = fan;
        this.stateName = "med";
        this.fanSpeed = 10;
    }

    @Override
    public void handleIncreaseSpeed() {
        fan.setState(new HighState(fan));
    }

    @Override
    public void handleDecreaseSpeed() {
        fan.setState(new LowState(fan));
    }
}
