package ru.spbstu.generics.simple;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class SimpleBox {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }
}
