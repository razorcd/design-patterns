package com.snippets.designpatterns.behavioral.observer.demo2;

public class Main {

    public static void main(String[] args) {
        MyObservable myObservable = new MyObservable();

        new MyObserver1("observer A", myObservable);   // IoC  (when you initialise me, I will inject myself to myObservable)
        new MyObserver1("observer B", myObservable);   // IoC  (when you initialise me, I will inject myself to myObservable)

        myObservable.notifyObservers("some data here");
    }
}
