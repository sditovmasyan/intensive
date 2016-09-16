package ru.spbstu.patterns.builder;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
