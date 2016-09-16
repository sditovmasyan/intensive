package ru.spbstu.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class OnDemandHolder5 {
    /**
     * + Ленивая инициализация
     * + Высокая производительность
     * - Невозможно использовать для не статических полей класса
     */
    public static class SingletonHolder {
        public static final OnDemandHolder5 HOLDER_INSTANCE = new OnDemandHolder5();
    }

    public static OnDemandHolder5 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }


}
