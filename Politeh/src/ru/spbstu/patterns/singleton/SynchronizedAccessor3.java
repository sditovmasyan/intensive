package ru.spbstu.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class SynchronizedAccessor3 {
    /**
     * + Ленивая инициализация
     * - Низкая производительность
     */

    private static SynchronizedAccessor3 instance;

    public static synchronized SynchronizedAccessor3 getInstance() {
        if (instance == null) {
            instance = new SynchronizedAccessor3();
        }
        return instance;
    }
}
