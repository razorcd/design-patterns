package com.snippets.designpatterns.creational.prototype;

public class Child {
    private int value;

    public Child() {
    }

    public Child(int value) {
        this.value = value;
    }


    /**
     * Copy constructor.
     *
     * @param oldChild the Child instance to copy
     */
    public Child(Child oldChild) {
        this.value = oldChild.value;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return value == child.value;
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Child{");
//        sb.append("value=").append(value);
//        sb.append('}');
//        return sb.toString();
//    }
}
