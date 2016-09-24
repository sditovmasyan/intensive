package ru.spbstu.qa;

import org.junit.*;
import ru.spbstu.qa.junit.Repeat;
import ru.spbstu.qa.junit.RepeatableTest;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class CheckSmth  {
    @BeforeClass
    public static void setUp() {
        System.out.println("before class");
    }

    @Before
    public void beforeTest() {
        System.out.println("before test");
    }

    @Test
    public void aaa() {
        System.out.println("aaaa");
    }

    @Test
    public void bbb() {
        System.out.println("bbbb");
    }

    @After
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterClass
    public static void after() {
        System.out.println("after class");
    }

}
