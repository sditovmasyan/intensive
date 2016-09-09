package ru.spbstu.arrays;

/**
 * Created by sergey.tovmasyan on 07/09/16.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] matrixA;

        matrixA = new int[2][3];

        matrixA[0][0] = 1;
        matrixA[0][1] = 2;
        matrixA[0][2] = 3;
        matrixA[1][0] = 4;
        matrixA[1][1] = 5;
        matrixA[1][2] = 6;

        int[][] matrixB = {
                {1,2,3},
                {4,5,6}
        };

        int[][] multiplyTable = new int[10][10];
        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                multiplyTable[i][j] = (i+1)*(j+1);
                System.out.print(
                        multiplyTable[i][j]
                                + "\t");
            }
            System.out.println();
        }
    }
}
