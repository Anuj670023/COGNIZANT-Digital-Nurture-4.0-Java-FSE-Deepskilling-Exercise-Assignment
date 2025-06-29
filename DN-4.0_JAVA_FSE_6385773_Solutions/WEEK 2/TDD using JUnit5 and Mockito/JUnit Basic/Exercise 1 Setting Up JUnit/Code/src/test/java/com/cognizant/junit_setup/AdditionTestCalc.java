package com.cognizant.junit_setup;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdditionTestCalc {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
   
}