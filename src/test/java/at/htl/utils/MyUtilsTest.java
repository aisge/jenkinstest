package at.htl.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyUtilsTest {

    @Test
    public void testMin() {
        assertEquals(3, MyUtils.getMin(5, 10,  3));
    }
}
