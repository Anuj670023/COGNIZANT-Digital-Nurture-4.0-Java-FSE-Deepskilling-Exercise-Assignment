package com.cognizant.junit_setup;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionTest {
    
    @Test
    public void testAdd() {
        System.out.println("Executing testAdd...");
        assertEquals("2 + 3 should equal 5", 5, MathUtils.add(2, 3));
        assertEquals("Negative addition", -1, MathUtils.add(2, -3));
    }
    
    @Test
    public void testComparison() {
        System.out.println("Executing testComparison...");
        assertTrue("5 should be greater than 3", MathUtils.isGreater(5, 3));
        assertFalse("3 should not be greater than 5", MathUtils.isGreater(3, 5));
    }
    
    @Test
    public void testNullOperations() {
        System.out.println("Executing testNullOperations...");
        assertNull("Should return null", MathUtils.returnNull());
        assertNotNull("Should return an object", MathUtils.createObject());
    }
    
    // Manual test execution method
    public static void main(String[] args) {
        System.out.println("Manual Test Execution:");
        AssertionTest test = new AssertionTest();
        
        test.testAdd();
        test.testComparison();
        test.testNullOperations();
        
        System.out.println("All manual tests completed!");
    }
}