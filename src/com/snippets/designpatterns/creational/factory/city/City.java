package com.snippets.designpatterns.creational.factory.city;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class City {

    protected Set<String> streets = new HashSet<>();
    protected int population;
    protected boolean isCapital;

    public Set<String> getStreets() {
        return streets;
    }

    public int getPopulation() {
        return population;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public City() {
        this.createCity();
    }

    public abstract void createCity();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population &&
                isCapital == city.isCapital &&
                Objects.equals(streets, city.streets);
    }

    @Override
    public int hashCode() {

        return Objects.hash(streets, population, isCapital);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("streets=").append(streets);
        sb.append(", population=").append(population);
        sb.append(", isCapital=").append(isCapital);
        sb.append('}');
        return sb.toString();
    }
}
