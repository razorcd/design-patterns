package com.snippets.designpatterns.behavioral.observer.demo1;

import java.util.Observable;
import java.util.Observer;

public class MainDemoOne {

    public static void main(String[] args) {
        MyObservable myObservable = new MyObservable();

        MyObserver myObserver1 = new MyObserver("observer B");
        MyObserver myObserver2 = new MyObserver("observer A");

        myObservable.addObserver(myObserver1);
        myObservable.addObserver(myObserver2);

        myObservable.sendDate("some data");
    }
}


class MyObservable extends Observable {

    /**
     * notify observers with the data
     * @param data the data to notify observers with.
     */
    public void sendDate(String data) {
        setChanged();              // signifies that myObservable has changed.  .hasChanged() returns true
        System.out.println("MyObservable has changed: " + hasChanged() + " (notifying)");
        notifyObservers(data);     // notifiers observers and signifies that myObservable has not changed again.  .hasChanged() returns false
    }
}


class MyObserver implements Observer {
    private String name;

    /**
     * Build an observer.
     * @param name the stateName of the observer.
     */
    MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("MyObservable has changed: " + o.hasChanged() + " (notify completed)");
        System.out.println("Observer '" + name + "' received argument: '" + arg + "'");
    }
}

