package ru.spbstu.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class StaticField1 {
    /**
     * + Простая и прозрачная реализация
     * + Потокобезопасность
     * - Не ленивая инициализация
     */

    public static final StaticField1 INSTANCE = new StaticField1();
}
