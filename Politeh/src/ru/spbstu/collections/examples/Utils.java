package ru.spbstu.collections.examples;

import java.util.Map;
import java.util.Set;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class Utils {
    public static void print(Map<String,Integer> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String,Integer> entry :
                    map.entrySet()) {
                sb.append(entry.getKey() + " "
                        + entry.getValue() + "\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void print(Set<String> set)  {
        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s + "\n");
        }
        System.out.println(sb.toString());
    }
}
