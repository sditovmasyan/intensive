package ru.spbstu.collections.examples;

import ru.spbstu.nobel.NobelParser;
import ru.spbstu.nobel.NobelPrize;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class LinkedHashMapEx {
    public static void main(String[] args) throws IOException {
        Map<String,Integer> map = new LinkedHashMap<>();

        List<NobelPrize> prizes = NobelParser.getNobelPrizes();

        for (NobelPrize prize : prizes) {
            String discipline = prize.getDiscipline();
            int count = map.containsKey(discipline) ? map.get(discipline) : 0;
            map.put(discipline,count + 1);
        }

        Utils.print(map);
    }
}
