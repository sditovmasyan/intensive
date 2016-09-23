package ru.spbstu.qa;

import org.junit.Test;
import ru.spbstu.qa.junit.Repeat;
import ru.spbstu.qa.junit.RepeatableTest;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class CheckSmth extends RepeatableTest {
    @Test
    @Repeat.Rule(times = 5)
    public void aaa() {
        System.out.println("aaaa");
    }
}
