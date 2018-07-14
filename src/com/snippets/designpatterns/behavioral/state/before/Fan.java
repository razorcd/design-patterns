package com.snippets.designpatterns.behavioral.state.before;

import java.util.Objects;

import static com.snippets.designpatterns.behavioral.state.before.SpeedState.*;

public class Fan {

    private SpeedState speedState = OFF;

    // all these IFs can be replaces with the State pattern
    public void increaseSpeed() {
        if (speedState == OFF) speedState = LOW;
        else if (speedState == LOW) speedState = MED;
        else if (speedState == MED) speedState = HIGH;
    }

    // all these IFs can be replaces with the State pattern
    public void decreaseSpeed() {
        if (speedState == HIGH) speedState = MED;
        else if (speedState == MED) speedState = LOW;
        else if (speedState == LOW) speedState = OFF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fan fan = (Fan) o;
        return speedState == fan.speedState;
    }

    @Override
    public int hashCode() {

        return Objects.hash(speedState);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Fan{");
        sb.append("speedState=").append(speedState);
        sb.append('}');
        return sb.toString();
    }
}
