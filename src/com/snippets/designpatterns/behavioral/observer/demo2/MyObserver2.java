package com.snippets.designpatterns.behavioral.observer.demo2;

public class MyObserver2 extends Observer {

    public MyObserver2(String name, MyObservable myObservable) {
        super(name, myObservable);
    }

    @Override
    public void update(String data) {
        System.out.println("Observer2 '" + this.name + "' was notified with data '" + data + "'.");
    }
}
