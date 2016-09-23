package ru.spbstu.qa.junit.suites;

import org.junit.Test;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class FeatureLogin {
    @Test(expected = Exception.class)
    public void loginException() throws Exception {
        throw new Exception();
    }

    @Test
    public void loginSuccess() {

    }
}
