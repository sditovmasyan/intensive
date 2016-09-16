package ru.spbstu.patterns.factory;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
