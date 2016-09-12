package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public class ContineuLoop {
    public static void main(String[] args) {
        for (int i=0; i< 10; i++) {
            if (i ==7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
