package ru.spbstu.collections.examples;

import ru.spbstu.nobel.NobelParser;
import ru.spbstu.nobel.NobelPrize;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class TreeSetEx {
    public static void main(String[] args) throws IOException {
        Set<String> set = new TreeSet<>();

        List<NobelPrize> prizes = NobelParser.getNobelPrizes();

        for (NobelPrize prize : prizes) {
            set.add(prize.getDiscipline());
        }

        Utils.print(set);
    }
}
