package ru.spbstu.qa.mockito;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class ArgumentMatchers3 {
    @Test
    public void testArgumentMathcer() {
        LinkedList mockedList = mock(LinkedList.class);

        //stubbing using built-in anyInt() argument matcher
        when(mockedList.get(anyInt())).thenReturn("element");

        //following prints "element"
        System.out.println(mockedList.get(999));

        //you can also verify using an argument matcher
        verify(mockedList).get(anyInt());

    }


}
