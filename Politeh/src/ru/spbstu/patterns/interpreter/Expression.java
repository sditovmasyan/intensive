package ru.spbstu.patterns.interpreter;

/**
 * Created by sergey.tovmasyan on 19/09/16.
 */
public interface Expression {
    public boolean interpret(String context);
}
