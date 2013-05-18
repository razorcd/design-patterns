package com.snippets.designpatterns.creational.factory.validator;

import com.snippets.designpatterns.creational.factory.city.City;

public interface Validator {

    /**
     * Validates all params of a city
     *
     * @param city the instance to validate
     * @return if valid or not
     */
    boolean isValid(City city);
}
