package ru.spbstu.qa.junit.suites;

import org.junit.Test;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class FeatureLogout {
    @Test(expected = Exception.class)
    public void logout() throws Exception {
        throw new Exception();
    }

    @Test
    public void logoutSuccess() {

    }
}
