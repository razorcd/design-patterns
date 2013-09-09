package com.snippets.designpatterns.behavioral.observer.demo2;

import java.util.ArrayList;
import java.util.List;

// The Subject
public class MyObservable {

    // holds list of all observers
    private List<Observer> observers = new ArrayList<>();


    // private List<String> dataBuffer = new ArrayList<>(); // data can be buffered here and notifications delayed (in case multiple calls are happening at same time and we only care about one Seting(data)).
    // data history can also be stored for new observers to be informed of.

    /**
     * Subscribe new observer.
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Unsubscribe observer.
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notify all observers.
     * @param data
     */
    public void notifyObservers(String data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }
}
