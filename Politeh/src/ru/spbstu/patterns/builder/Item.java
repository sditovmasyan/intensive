package ru.spbstu.patterns.builder;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
