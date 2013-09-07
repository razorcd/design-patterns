package com.snippets.designpatterns.behavioral.memento;

import java.util.Objects;

public class Element {

    private int id;
    private String data;

    public Element(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    /**
     * Get a copy of the current element
     * @return [Element] element copy
     */
    public Element save() {
        return new Element(id, data);
    }

    /**
     * Reverts the current element to the Element state
     * @param el the Element state to revert to
     */
    public void revert(Element el) {
        this.id = el.getId();
        this.data = el.getData();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return id == element.id &&
                Objects.equals(data, element.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, data);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Element{");
        sb.append("id=").append(id);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
