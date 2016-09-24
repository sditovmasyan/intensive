package ru.spbstu.qa.mockito;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */

//Rmemebring things an verifying
public class Behaviour1 {
    @Test
    public void testMockBehavior() {
        List mockedList = Mockito.mock(List.class);

        //using mock object
        mockedList.add("one");
        mockedList.clear();

        //verification
        verify(mockedList).add("two");
        verify(mockedList).clear();

        //never mock List :)
    }
}
