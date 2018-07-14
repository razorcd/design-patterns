package com.snippets.designpatterns.behavioral.state.after.state;

import com.snippets.designpatterns.behavioral.state.after.Fan;

public class LowState extends State {

    public LowState(Fan fan) {
        this.fan = fan;
        this.stateName = "low";
        this.fanSpeed = 5;
    }

    @Override
    public void handleIncreaseSpeed() {
        fan.setState(new MedState(fan));
    }

    @Override
    public void handleDecreaseSpeed() {
        fan.setState(new OffState(fan));
    }
}
