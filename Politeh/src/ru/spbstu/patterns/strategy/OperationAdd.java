package ru.spbstu.patterns.strategy;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}