package ru.spbstu.patterns.prototype;

import ru.spbstu.patterns.prototype.Shape;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
