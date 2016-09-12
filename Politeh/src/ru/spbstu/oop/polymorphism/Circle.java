package ru.spbstu.oop.polymorphism;

/**
 * Created by sergey.tovmasyan on 12/09/16.
 */
public class Circle extends Shape {
    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.println("Drawing circle (" + x + ", " + y + ", " + r + ")");
    }
}
