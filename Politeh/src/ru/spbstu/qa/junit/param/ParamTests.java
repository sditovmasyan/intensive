package ru.spbstu.qa.junit.param;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
@RunWith(Parameterized.class)
public class ParamTests {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
        });
    }

    private int param1;
    private int param2;

    public ParamTests(int input, int expected) {
        param1 = input;
        param2 = expected;
    }

    @Test
    public void testWithDifferentParams() {
        Assert.assertTrue(param1 + " * " + param2 + " < 5",param1 * param2 > 5);
    }

}
