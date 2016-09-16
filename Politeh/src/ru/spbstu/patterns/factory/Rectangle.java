package ru.spbstu.patterns.factory;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
