package ru.spbstu.generics.bounding;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */

// можно и несколько ограничений через &, но класс идёт первым
public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }


}