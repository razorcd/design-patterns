package com.snippets.designpatterns.creational.factory;

import com.snippets.designpatterns.creational.factory.city.City;

public class Main {

    public static void main(String[] args) {

        City c1 = CityFactory.getCity(CityTypes.BERLIN);
        System.out.println(c1);

        City c2 = CityFactory.getCity(CityTypes.MUNICH);
        System.out.println(c2);

        System.out.println(CityFactory.getValidator().isValid(c1));
    }
}
