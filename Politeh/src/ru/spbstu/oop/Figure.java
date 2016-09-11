package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public abstract class Figure {
    protected int x = 0;
    protected int y = 0;

    abstract void draw();
    abstract void resize();
    abstract void paint();

    public void repaint() {
        paint();
        paint();
    }


}
