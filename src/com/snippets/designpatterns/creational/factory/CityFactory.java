package com.snippets.designpatterns.creational.factory;

import com.snippets.designpatterns.creational.factory.city.Berlin;
import com.snippets.designpatterns.creational.factory.city.City;
import com.snippets.designpatterns.creational.factory.city.Munich;
import com.snippets.designpatterns.creational.factory.validator.CityValidator;
import com.snippets.designpatterns.creational.factory.validator.Validator;

public class CityFactory {

    private CityFactory() {
    }

    /**
     * Factory to build the city instance based on the input.
     * Contract driven: Creation of the objects should be done in separate classes. (Berlin, Munich, etc)
     * Easy extendable with new implementations. It is part of a larger framework.
     * An Abstract Factory pattern would be a Factory of factories.     *
     *
     * @param cityName the city to build
     * @return the city
     */
    public static City getCity(CityTypes cityName) {

        switch (cityName) {
            case BERLIN:
                return new Berlin();
            case MUNICH:
                return new Munich();
            default:
                return null;
        }

    }

    /**
     *
     * @return
     */
    public static Validator getValidator() {
        return new CityValidator();
    }
}
