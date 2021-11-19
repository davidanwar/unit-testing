package com.falah.unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    public void testMock() {
        List<String> list = Mockito.mock(List.class);
        Mockito.when(list.get(0)).thenReturn("David");
        Mockito.when(list.get(1)).thenReturn("Anwar");
        System.out.println(list.get(0));
        Assertions.assertEquals("Anwar", list.get(1));
        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
