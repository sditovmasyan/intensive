package ru.spbstu.collections.examples;

import ru.spbstu.nobel.NobelParser;
import ru.spbstu.nobel.NobelPrize;

import java.io.IOException;
import java.util.*;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class HashSetEx {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();

        List<NobelPrize> prizes = NobelParser.getNobelPrizes();

        for (NobelPrize prize : prizes) {
            set.add(prize.getDiscipline());
        }

        Utils.print(set);
    }
}
