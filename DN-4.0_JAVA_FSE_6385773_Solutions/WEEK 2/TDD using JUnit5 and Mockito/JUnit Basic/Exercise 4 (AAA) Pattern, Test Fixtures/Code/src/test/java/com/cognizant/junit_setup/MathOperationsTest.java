package com.cognizant.junit_setup;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class MathOperationsTest {

    private MathOperations math;

    @Before
    public void setUp() {
        math = new MathOperations();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        math = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAdd() {
        int result = math.add(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testSquare() {
        assertEquals(25, math.square(5));
    }

    @Test
    public void testIsEvenTrue() {
        assertTrue(math.isEven(10));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse(math.isEven(9));
    }
}
