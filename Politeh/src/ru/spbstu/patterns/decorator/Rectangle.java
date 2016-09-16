package ru.spbstu.patterns.decorator;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
