package ru.spbstu.generics.multiple;

import ru.spbstu.generics.simple.GenericBox;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }


    public static void main(String[] args) {
        Pair<String, Integer> p1 =
                new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 =
                new OrderedPair<String, String>("hello", "world");

        OrderedPair<String, GenericBox<Integer>> p
                = new OrderedPair<>
                ("primes",
                        new GenericBox<Integer>());
        p.getValue().set(2);
        p.getKey();


    }
}
