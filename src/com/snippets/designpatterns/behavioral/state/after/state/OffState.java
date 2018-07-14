package com.snippets.designpatterns.behavioral.state.after.state;

import com.snippets.designpatterns.behavioral.state.after.Fan;

public class OffState extends State {

    public OffState(Fan fan) {
        this.fan = fan;
        this.stateName = "off";
        this.fanSpeed = 0;
    }

    @Override
    public void handleIncreaseSpeed() {
        fan.setState(new LowState(fan));
    }

    public void handleMaxSpeed() {
        fan.setState(new HighState(fan));
    }
}
