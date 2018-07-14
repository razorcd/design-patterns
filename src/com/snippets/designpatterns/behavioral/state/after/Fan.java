package com.snippets.designpatterns.behavioral.state.after;

import com.snippets.designpatterns.behavioral.state.after.state.OffState;
import com.snippets.designpatterns.behavioral.state.after.state.State;

import java.util.Objects;


/**
 * Class to create objects with states.
 */
public class Fan {

    private String model;

    // holds state of object
    private State state;


    public Fan(String model) {
        this.model = model;
        this.state = new OffState(this);  // initial state
    }

    public String getModel() {
        return model;
    }

    /**
     * Get speed. This depends on the state so it is stored in the state object.
     * @return current speed
     */
    public int getSpeed() {
        return state.getFanSpeed();
    }


    /**
     * Sets new state.
     * @param state new state
     */
    public void setState(State state) {
        this.state = state;
    }


    /**
     * Increases speed of the fan. Moves to next state.
     */
    public void increaseSpeed() {
        this.state.handleIncreaseSpeed();
    }

    /**
     * Decreases speed of the fan. Moves to before state.
     */
    public void decreaseSpeed() {
        this.state.handleDecreaseSpeed();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fan fan = (Fan) o;
        return Objects.equals(model, fan.model) &&
                Objects.equals(state, fan.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, state);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fan{");
        sb.append("model='").append(model).append('\'');
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
