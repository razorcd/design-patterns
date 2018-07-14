package com.snippets.designpatterns.behavioral.state.after.state;

import com.snippets.designpatterns.behavioral.state.after.Fan;

public class HighState extends State {

    public HighState(Fan fan) {
        this.fan = fan;
        this.stateName = "high";
        this.fanSpeed = 15;
    }

    @Override
    public void handleDecreaseSpeed() {
        fan.setState(new MedState(fan));
    }
}
