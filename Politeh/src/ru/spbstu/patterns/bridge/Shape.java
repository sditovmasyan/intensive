package ru.spbstu.patterns.bridge;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
