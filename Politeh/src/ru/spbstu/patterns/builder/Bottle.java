package ru.spbstu.patterns.builder;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
