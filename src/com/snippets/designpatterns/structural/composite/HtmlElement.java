package com.snippets.designpatterns.structural.composite;

import java.util.stream.Collectors;

/**
 * Polymorphic implementation of the Sandwich class
 */
public class HtmlElement extends Element {

    /**
     * Prints all elements as a document.
     * @return [String] doc
     */
    @Override
    public String toString() {
        return new StringBuilder()
                .append("<" + name + buildPropertiesString() + ">\n")
                .append(buildContentString())
                .append(buildSubelementsString())
                .append("</" + name + ">")
                .toString();
    }

    private String buildPropertiesString() {
        String propertiesStr = getProperties().entrySet()
                .stream()
                .map(e -> "\"" + e.getKey() + "\"=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(" "));
        if (!propertiesStr.isEmpty()) propertiesStr = " " + propertiesStr;
        return propertiesStr;
    }

    private String buildContentString() {
        String contentStr = content;
        if (!contentStr.isEmpty()) contentStr = contentStr + "/n";
        return contentStr;
    }

    private String buildSubelementsString() {
        String subMenuesStr = subElements
                .stream()
                .map(Element::toString)
                .collect(Collectors.joining("\n"));
        if (!subMenuesStr.isEmpty()) subMenuesStr = subMenuesStr + "\n";
        return subMenuesStr;
    }
}
