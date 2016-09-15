package ru.spbstu.generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class LowerBoundedWildcard {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }


    public static void main(String[] args) {
        List<Number> li = new ArrayList<>();
        addNumbers(li);
        System.out.println(li);

    }
}
