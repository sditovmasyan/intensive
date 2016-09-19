package ru.spbstu.generics.bounding;

import java.io.Serializable;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */

// можно и несколько ограничений через &, но класс идёт первым
public class NaturalNumber<T extends Integer & Cloneable & Serializable> {

    private T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }


}