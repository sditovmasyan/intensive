package ru.spbstu.collections;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergey.tovmasyan on 14/09/16.
 */
public class TryHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        for (int i=0; i<100; i++) {
            map.put(String.valueOf(i),
                    RandomStringUtils.
                            randomAlphabetic(10));
        }
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            System.out.println(entry.getKey()
                    +
                    " : " + entry.getValue());
        }
    }
}
