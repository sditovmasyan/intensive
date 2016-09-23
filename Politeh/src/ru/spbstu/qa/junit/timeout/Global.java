package ru.spbstu.qa.junit.timeout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class Global {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(2); // 10 seconds max per method tested

    @Test
    public void testSleep1() throws Exception {
        TimeUnit.SECONDS.sleep(3); // sleep for 100 seconds
    }

    @Test
    public void testSleep2() throws Exception {
        TimeUnit.SECONDS.sleep(1);
    }
}
