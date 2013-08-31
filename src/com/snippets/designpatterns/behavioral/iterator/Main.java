package com.snippets.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ElementRepository elementRepository = new ElementRepository();

        elementRepository.addElements("one");
        elementRepository.addElements("two");
        elementRepository.addElements("three");

        System.out.print("List: ");
        System.out.println(elementRepository.getElements());


        System.out.print("For loop: ");
        for (String el : elementRepository) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.print("While loop: ");
        Iterator<String> elementsIterator = elementRepository.iterator();
        while(elementsIterator.hasNext()) {
            System.out.print(elementsIterator.next() + " ");
        }

    }
}
