package com.snippets.designpatterns.behavioral.state.after;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan("SuperFan");

        System.out.println(fan);

        fan.increaseSpeed();
        System.out.println(fan);

        fan.increaseSpeed();
        System.out.println(fan);

        fan.increaseSpeed();
        System.out.println(fan);

        fan.increaseSpeed();


        System.out.println();


        System.out.println(fan);

        fan.decreaseSpeed();
        System.out.println(fan);

        fan.decreaseSpeed();
        System.out.println(fan);

        fan.decreaseSpeed();
        System.out.println(fan);

        fan.decreaseSpeed();
    }
}
