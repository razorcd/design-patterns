package com.snippets.designpatterns.creational.factory.city;

public class Munich extends City  {
    @Override
    public void createCity() {
        streets.add("Munich Street 1");
        streets.add("Munich Street 2");
        population = 1500000;
        isCapital = false;
    }
}
