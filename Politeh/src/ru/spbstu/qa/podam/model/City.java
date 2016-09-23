package ru.spbstu.qa.podam.model;

import java.util.List;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class City {
    private String name;
    private int population;
    private List<Street> streets;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }
}
