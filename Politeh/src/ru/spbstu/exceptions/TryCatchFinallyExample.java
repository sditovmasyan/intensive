package ru.spbstu.exceptions;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Created by sergey.tovmasyan on 11/09/16.
 */
public class TryCatchFinallyExample {

    public static int getAreaValue(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("value of 'x' or 'y' is negative: x=" + x + ", y=" + y);
        return x * y;
    }


    /**
     * Здесь мы поймали IllegalArgumentException и залогировали данное событие.
     * Дело в том что "починить" такую поломку мы не можем, не будем же мы угадывать что хотел пользователь :).
     * Поэтому мы пробрасываем данное исключение дальше с помощью "throw e;".
     * Такое часто можно встретить на серверах приложений(веб-серверах).
     *
     * В данном случае в сигнатуре метода отсутствует throws IllegalArgumentException,
     * это не сделано потому что исключение IllegalArgumentException является не проверяемым, о них мы ещё поговорим
     */

    public static void main(String[] args) {

        int result = 0;

        try {
            result = getAreaValue(-1, 100);
        } catch (IllegalArgumentException e) {
            Logger.getLogger(TryCatchFinallyExample.class.getName()).log(
                    new LogRecord(Level.WARNING, "В метод вычисления площади был передан аргумент с негативным значением!"));
            throw e;
        }
        System.out.println("Result is : " + result);
    }


}
