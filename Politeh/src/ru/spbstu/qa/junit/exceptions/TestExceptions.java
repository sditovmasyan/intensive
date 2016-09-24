package ru.spbstu.qa.junit.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class TestExceptions {
    @Rule
    public ExpectedException thrown =
            ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage()
            throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index: 0, Size: 0");
        list.get(0); // execution will never get past this line
    }
}
