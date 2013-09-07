package com.snippets.designpatterns.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        Element element = new Element(1, "data1");

        Caretaker caretaker = new Caretaker();

        caretaker.save(element);

        element.setData("new data 1");

        caretaker.save(element);

        element.setData("new data 2");


        System.out.println("Element: " + element);

        //undo
        caretaker.revert(element);
        System.out.println("Element: " + element);

        //undo
        caretaker.revert(element);
        System.out.println("Element: " + element);
    }
}
