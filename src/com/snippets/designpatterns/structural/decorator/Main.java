package com.snippets.designpatterns.structural.decorator;

import com.snippets.designpatterns.structural.decorator.sandwichdecorators.MeatSandwichDecorator;
import com.snippets.designpatterns.structural.decorator.sandwich.Sandwich;
import com.snippets.designpatterns.structural.decorator.sandwich.SimpleSandwich;
import com.snippets.designpatterns.structural.decorator.sandwichdecorators.VeggieSandwichDecorator;

public class Main {


    public static void main(String[] args) {
        Sandwich simpleSandwich = new SimpleSandwich();
        System.out.println(simpleSandwich.make());


        // decorator for any Sandwich implementation
        Sandwich meatSandwich = new MeatSandwichDecorator(simpleSandwich, "ham");
        System.out.println(meatSandwich.make());


        // decorator for any Sandwich implementation
        VeggieSandwichDecorator meatVeggieSandwitch = new VeggieSandwichDecorator(meatSandwich);
        meatVeggieSandwitch.addVeggies("onions", "tommatos");
        System.out.println(meatVeggieSandwitch.make());
    }
}
