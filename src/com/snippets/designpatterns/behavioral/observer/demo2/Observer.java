package com.snippets.designpatterns.behavioral.observer.demo2;

public abstract class Observer {

    /**
     * The myObservable where this Observer will be injected to.
     */
    protected MyObservable myObservable;

    protected String name;

    public Observer(String name, MyObservable myObservable) {
        this.name = name;
        this.myObservable = myObservable;
        this.myObservable.addObserver(this);
    }

    /**
     * Performs action invoked by myObservable.
     * @param data input data
     */
    public abstract void update(String data);
}
