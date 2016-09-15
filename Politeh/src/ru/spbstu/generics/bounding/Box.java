package ru.spbstu.generics.bounding;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class Box<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));

        integerBox.inspect(1);
        //integerBox.inspect("some text");  будет ошибка
    }
}
