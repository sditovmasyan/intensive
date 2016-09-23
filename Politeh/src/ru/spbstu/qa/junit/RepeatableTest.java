package ru.spbstu.qa.junit;

import org.junit.Rule;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class RepeatableTest {
    @Rule
    public Repeat repeatRule = new Repeat();


}
