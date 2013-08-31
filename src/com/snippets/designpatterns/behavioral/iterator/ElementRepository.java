package com.snippets.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElementRepository implements Iterable<String>{

    private List<String> elements = new ArrayList<>();

    public List<String> getElements() {
        return elements;
    }

    public void addElements(String elements) {
        this.elements.add(elements);
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return elements.size() > currentIndex;
            }

            @Override
            public String next() {
                return elements.get(currentIndex++);
            }
        };
    }
}
