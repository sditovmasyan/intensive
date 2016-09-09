package ru.spbstu.arrays;

import java.util.Arrays;

/**
 * Created by sergey.tovmasyan on 07/09/16.
 */
public class FirstTouch {
    public static void main(String[] args) {
        int[] arr3 = {15,6,7,4,20};
        Arrays.sort(arr3);

        for (int i=0; i< arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
