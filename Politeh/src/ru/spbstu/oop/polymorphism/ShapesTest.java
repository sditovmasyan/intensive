package ru.spbstu.oop.polymorphism;

/**
 * Created by sergey.tovmasyan on 12/09/16.
 */
public class ShapesTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(0, 0, 20),
                new Rectangle(1, 1, 30, 40)
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
