package com.snippets.designpatterns.behavioral.state.after.state;

import com.snippets.designpatterns.behavioral.state.after.Fan;

public abstract class State {

    /**
     * The object that holds this state.
     */
    protected Fan fan;

    // state related properties

    protected String stateName;
    protected int fanSpeed;

    public String getStateName() {
        return stateName;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    /**
     * Set object next state.
     */
    public void handleIncreaseSpeed() {
        System.out.println("Can not increase speed from state " + this.getClass().getSimpleName());
    }

    /**
     * Set object before state.
     */
    public void handleDecreaseSpeed() {
        System.out.println("Can not decrease speed from state " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("State{");
        sb.append("stateName='").append(stateName).append('\'');
        sb.append(", fanSpeed=").append(fanSpeed);
        sb.append('}');
        return sb.toString();
    }
}
