package com.snippets.designpatterns.structural.decorator.sandwichdecorators;

import com.snippets.designpatterns.structural.decorator.sandwich.Sandwich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VeggieSandwichDecorator extends SandwichDecorator {

    private List<String> veggies = new ArrayList<>();

    public VeggieSandwichDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public VeggieSandwichDecorator(Sandwich sandwich, List<String> veggies) {
        super(sandwich);
        this.veggies = veggies;
    }

    @Override
    public String make() {
        return sandwich.make() + " with " + getVeggies().stream().collect(Collectors.joining(" and "));
    }

    public List<String> getVeggies() {
        return veggies;
    }

    public void addVeggies(String ...newVeggies) {
        this.veggies.addAll(Arrays.asList(newVeggies));
    }
}
