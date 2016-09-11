package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 10/09/16.
 */
public class TryStatic {
    static {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    public static void print4(){
        System.out.println(4);
    }


    public static void main(String[] args) {
        TryStatic.print4();
    }
}
