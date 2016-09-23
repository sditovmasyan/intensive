package ru.spbstu.qa.mockito;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by sergey.tovmasyan on 23/09/16.
 */
public class StubVoid5 {
    @Test
    public void testStubVoid() {
        List mockedList = mock(List.class);

        doThrow(new RuntimeException()).when(mockedList).clear();

        //following throws RuntimeException:
        mockedList.clear();


    }
}
