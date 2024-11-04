package com.venu.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorParameterizedTest {

    @Parameterized.Parameter(0)
    public int m1;

    @Parameterized.Parameter(1)
    public int m2;
    @Parameterized.Parameter(2)
    public int result;

    // creates the test data
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 2}, {5, 3, 15}, {121, 4, 484}};
        return Arrays.asList(data);
    }

    @Test
    public void testMultiplyException() {
        Calculator calculator = new Calculator();
        assertEquals("Result", result, calculator.multiply(m1, m2));
    }

}
