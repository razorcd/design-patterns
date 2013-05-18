package com.snippets.designpatterns.creational.factory.validator;

import com.snippets.designpatterns.creational.factory.city.City;

public class CityValidator implements Validator {

    @Override
    public boolean isValid(City city) {
        if (city.getPopulation() <= 0 || city.getPopulation() >= 10_000_000) return false;
        if (!city.getStreets().stream().allMatch(c -> c.matches("^[A-Z]{1}[a-zA-Z\\s1-9]*"))) return false;
        return true;
    }
}
