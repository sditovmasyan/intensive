package ru.spbstu.patterns.prototype;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}