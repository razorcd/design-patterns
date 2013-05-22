package com.snippets.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        MySandwich mySandwich = new MySandwich().getBuilder()
                .bread("White")
                .cream("Majo")
                .toasted(true)
                .build();

        System.out.println(mySandwich);

    }
}
