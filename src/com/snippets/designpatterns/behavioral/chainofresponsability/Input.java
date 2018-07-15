package com.snippets.designpatterns.behavioral.chainofresponsability;

import java.util.Objects;

public class Input {

    private String param1;
    private int param2;
    private boolean param3;

    public Input() {
    }

    public Input(String param1, int param2, boolean param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public boolean isParam3() {
        return param3;
    }

    public void setParam3(boolean param3) {
        this.param3 = param3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Input input = (Input) o;
        return param2 == input.param2 &&
                param3 == input.param3 &&
                Objects.equals(param1, input.param1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(param1, param2, param3);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Input{");
        sb.append("param1='").append(param1).append('\'');
        sb.append(", param2=").append(param2);
        sb.append(", param3=").append(param3);
        sb.append('}');
        return sb.toString();
    }
}
