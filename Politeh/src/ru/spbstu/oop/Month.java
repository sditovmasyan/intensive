package ru.spbstu.oop;

/**
 * Created by sergey.tovmasyan on 09/09/16.
 */
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY;

    public static void main(String[] args) {
        Month myBirhdayMonth = Month.MARCH;

        if (myBirhdayMonth == Month.MARCH) {
            System.out.println(":(");
        } else if (myBirhdayMonth == Month.APRIL) {
            System.out.println(":(");
        } else if (myBirhdayMonth == Month.MARCH) {
            System.out.println(":(");
        } else if (myBirhdayMonth == Month.FEBRUARY) {
            System.out.println("wow!!!");
        }

    }
}
