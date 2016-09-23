package ru.spbstu.qa.podam.model;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class Country {
    private String name;
    private Currency currency;
    private List<City> cities;

    public Country() {
        setCities(new ArrayList<City>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
