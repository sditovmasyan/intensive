package ru.spbstu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class Try {
    List<IDrawable> listeners = new ArrayList<>();

    public void addListener(IDrawable drawable) {
        listeners.add(drawable);
    }

    public void removeListener(IDrawable drawable) {
        listeners.remove(drawable);
    }

    public void drawAll() {
        System.out.println("drawing");
        for (IDrawable listener : listeners) {
            listener.drawed();
        }
    }

    public static void main(String[] args) {
        IDrawable circle = new Circle();
        IDrawable square = new Square();
        Try tr = new Try();
        tr.addListener(circle);
        tr.addListener(square);

        tr.drawAll();
    }
}
