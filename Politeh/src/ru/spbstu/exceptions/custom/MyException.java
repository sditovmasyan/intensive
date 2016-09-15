package ru.spbstu.exceptions.custom;

/**
 * Created by sergey.tovmasyan on 11/09/16.
 */
public class MyException extends Exception{
    public MyException(Throwable e) {
        initCause(e);
    }

    public MyException(String message) {
        super(message);
    }

}
