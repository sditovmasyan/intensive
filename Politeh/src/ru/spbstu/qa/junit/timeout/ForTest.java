package ru.spbstu.qa.junit.timeout;

import org.junit.Test;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class ForTest {

    @Test(timeout=1000)
    public void timeoutTest() throws InterruptedException {
        Thread.sleep(2000);
    }
}
