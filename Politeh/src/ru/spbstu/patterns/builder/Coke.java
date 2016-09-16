package ru.spbstu.patterns.builder;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
