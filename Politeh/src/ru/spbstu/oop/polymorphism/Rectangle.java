package ru.spbstu.oop.polymorphism;

/**
 * Created by sergey.tovmasyan on 12/09/16.
 */
public class Rectangle extends Shape {
    private int x,y,w,h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle (" + x + ", " + y + ", " + w + ", " + h + ")");
    }
}
