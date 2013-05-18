package com.snippets.designpatterns.creational.factory.city;

public class Berlin extends City  {
    @Override
    public void createCity() {
        streets.add("Berlin Street 1");
        streets.add("Berlin Street 2");
        population = 3500000;
        isCapital = true;
    }
}
