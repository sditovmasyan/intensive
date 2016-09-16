package ru.spbstu.patterns.singleton;

/**
 * Created by sergey.tovmasyan on 16/09/16.
 */
public class DoubleCheckedAndVolatile4 {
    /**
     * + Ленивая инициализация
     * + Высокая производительность
     * - Поддерживается только с JDK 1.5
     */

    private static volatile DoubleCheckedAndVolatile4 instance;

    public static DoubleCheckedAndVolatile4 getInstance() {
        DoubleCheckedAndVolatile4 localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedAndVolatile4.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedAndVolatile4();
                }
            }
        }
        return localInstance;
    }

    /**
     volatile как бы говорит компилятору, что значение переменной может в любой момент измениться
     из другого потока и даже из другой программы, а он этого и не заметит.
     Поэтому компилятор прекращает выполнять различную оптимизацию,
     связанную с этой переменной, (к примеру, помещение копии в регистры) и всегда читает ее значение из памяти

     A synchronized method automatically performs a lock operation when it is invoked;
     its body is not executed until the lock operation has successfully completed...
     */
}
