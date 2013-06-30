package com.snippets.designpatterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Element span = new HtmlElement()
                .name("span")
                .content("Lorem ipsum ...");

        Element div = new HtmlElement()
                .name("div")
                .properties("display", "none")
                .subElement(span);

        Element p = new HtmlElement()
                .name("p")
                .properties("style", "{'color':'red'}");

        // create main Sandwich composite: with children Elements
        Element main = new HtmlElement()
                .name("html")
                .subElement(div)
                .subElement(p);


        // print entire document. Goes trough each child element.
        System.out.println(main.toString());
    }
}
