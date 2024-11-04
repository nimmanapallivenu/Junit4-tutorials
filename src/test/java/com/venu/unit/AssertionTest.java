package com.venu.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionTest {


    @Test
    public void testFail() {
        fail("Test case failed");
    }

    @Test
    public void testAssertFalse() {
        assertFalse("AssertFalse testing", 4 == 5);
    }

    @Test
    public void testAssertTrue() {
        assertTrue("AssertTrue testing", 4 == 4);
    }

    @Test
    public void testAssertEquals() {
        assertEquals(10, 10);
    }

    @Test
    public void testAssertNull() {
        String name = null;
        assertNull(name);
    }

    @Test
    public void testAssertNotNull() {
        String name = "null";
        assertNotNull(name);
    }

    @Test
    public void testAssertSame() {
        String name = null;
        assertSame(name, null);
    }

    @Test
    public void testAssertNotSame() {
        String name = "null";
        assertNotSame(name, null);
    }


}
