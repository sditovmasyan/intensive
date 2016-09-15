package ru.spbstu.generics.simple;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class GenericBox<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }


    public static void main(String[] args) {
        SimpleBox box = new SimpleBox();
        // vs
        GenericBox<Integer> magicBox = new GenericBox<Integer>();
        magicBox.set(1);
    }

}
