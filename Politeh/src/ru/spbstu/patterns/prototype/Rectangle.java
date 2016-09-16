package ru.spbstu.patterns.prototype;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}