package ru.spbstu.patterns.builder;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
