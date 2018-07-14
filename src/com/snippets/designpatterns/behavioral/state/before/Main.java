package com.snippets.designpatterns.behavioral.state.before;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println(fan);
        fan.increaseSpeed();
        System.out.println(fan);
        fan.increaseSpeed();
        System.out.println(fan);
        fan.increaseSpeed();
        System.out.println(fan);

        fan.decreaseSpeed();
        System.out.println(fan);
        fan.decreaseSpeed();
        System.out.println(fan);
        fan.decreaseSpeed();
        System.out.println(fan);
    }
}
