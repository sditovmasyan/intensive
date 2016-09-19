package ru.spbstu.patterns.strategy;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
