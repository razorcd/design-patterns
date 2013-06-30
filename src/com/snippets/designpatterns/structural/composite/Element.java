package com.snippets.designpatterns.structural.composite;

import java.util.*;

/**
 * Composite main class that holds sub elements of same type.
 */
public abstract class Element {

    protected String name = "";
    protected Map<String, String> properties = new HashMap<>();
    protected String content = "";

    // holds the composite child elements. Tree structure.
    protected List<Element> subElements = new ArrayList<>();

    public Element() {
    }

    public Element(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public String getContent() {
        return content;
    }

    public List<Element> getSubElements() {
        return subElements;
    }


    public Element name(String name) {
        this.name = name;
        return this;
    }

    public Element properties(String key, String value) {
        this.properties.put(key, value);
        return this;
    }

    public Element content(String content) {
        this.content = content;
        return this;
    }

    public Element subElement(Element subElements) {
        this.subElements.add(subElements);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(name, element.name) &&
                Objects.equals(properties, element.properties) &&
                Objects.equals(content, element.content) &&
                Objects.equals(subElements, element.subElements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, properties, content, subElements);
    }

    /**
     * Required implementation for printing the element.
     * @return [String] the printed element
     */
    @Override
    public abstract String toString();
}
