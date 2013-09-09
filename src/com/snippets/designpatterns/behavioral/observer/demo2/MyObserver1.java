package com.snippets.designpatterns.behavioral.observer.demo2;

public class MyObserver1 extends Observer {

    public MyObserver1(String name, MyObservable myObservable) {
        super(name, myObservable);
    }

    @Override
    public void update(String data) {
        System.out.println("Observer1 '" + this.name + "' was notified with data '" + data + "'.");
    }
}
