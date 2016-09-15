package ru.spbstu.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 14/09/16.
 */
public class Speed {
    public static void main(String[] args) {
        int count = 10_000_000;
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i= 0; i<count; i++) {
            list.add(i);
        }


        long delta = System.currentTimeMillis()
                - start;
        System.out.println(delta);
        System.out.println(list.size());
    }
}
