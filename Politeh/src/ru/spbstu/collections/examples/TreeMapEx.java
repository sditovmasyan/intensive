package ru.spbstu.collections.examples;

import ru.spbstu.nobel.NobelParser;
import ru.spbstu.nobel.NobelPrize;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class TreeMapEx {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new TreeMap<>(
                (o1, o2) -> o2.length() - o1.length()
        );

        List<NobelPrize> prizes = NobelParser.getNobelPrizes();

        for (NobelPrize prize : prizes) {
            String discipline = prize.getDiscipline();
            int count = map.containsKey(discipline) ? map.get(discipline) : 0;
            map.put(discipline,count + 1);
        }



        Utils.print(map);
    }
}
