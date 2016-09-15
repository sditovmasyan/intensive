package ru.spbstu.generics.wildcard;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class UnboundedWildcard {
    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);
    }
}
