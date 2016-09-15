package ru.spbstu.collections.examples;

import ru.spbstu.nobel.NobelParser;
import ru.spbstu.nobel.NobelPrize;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class LinkedHashSetEx {
    public static void main(String[] args) throws IOException {
        Set<String> set = new LinkedHashSet<>();

        List<NobelPrize> prizes = NobelParser.getNobelPrizes();

        for (NobelPrize prize : prizes) {
            set.add(prize.getDiscipline());
        }

        Utils.print(set);
    }
}
