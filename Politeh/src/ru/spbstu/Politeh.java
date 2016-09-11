package ru.spbstu;

/**
 * Created by sergey.tovmasyan on 05/09/16.
 */
public class Politeh implements Cloneable {
    int i = 10;

    public static void main(String[] args) throws CloneNotSupportedException {
       Politeh politeh = new Politeh();
        Politeh politeh1 = (Politeh) politeh.clone();

        System.out.println(politeh.i);
        System.out.println(politeh1.i);
    }


}
