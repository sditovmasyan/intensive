package ru.spbstu.generics.bounding;

/**
 * Created by sergey.tovmasyan on 15/09/16.
 */
public class MethodBounding {

    /** Будет ошибка компиляции, так как e и elem нельзя сравнить через >. Так можно сравнивать примитивы

     public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e > elem)
                ++count;
        return count;
    }*/



    /** Но можем переделать метод  на работу с компаратором
     * public interface Comparable<T> {
     *    public int compareTo(T o);
     *}
     */

    public static <T extends Comparable<T>>
    int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
