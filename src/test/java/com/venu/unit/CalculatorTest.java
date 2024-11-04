package com.venu.unit;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
Order of Test execution
@BeforeClass method called
@Before method called
@Test testMultiply called
@After method called
@Before method called
@Test testMultiplyWithZero called
@After method called
@AfterClass method called
 */
public class CalculatorTest {
    private Calculator calculator;


    @BeforeClass
    public static void beforeClassLoad() {
        System.out.println("@BeforeClass method called");
    }

    @AfterClass
    public static void afterClassLoad() {
        System.out.println("@AfterClass method called");
    }

    @After
    public void cleanUp() {
        System.out.println("@After method called");
    }

    @Before
    public void setUp() {
        System.out.println("@Before method called");
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        System.out.println("@Test testMultiply called");
        assertEquals("Regular multiplication should work: ", calculator.multiply(2, 4), 8);
    }

    @Test
    public void testMultiplyWithZero() {
        System.out.println("@Test testMultiplyWithZero called");
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(0, 5));
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5, 0));
    }

    @Test
    @Ignore
    public void testIgnore() {
        System.out.println("@Ignore test");
    }

    @Test(expected = NullPointerException.class)
    public void testException() {
        String name = null;
        name.toString();
        System.out.println("@test Exception triggered");
    }

    @Test(timeout = 100)
    public void testTimeout() {
        System.out.println("@Test Time out has been configured..");
        assertTrue(calculator.multiply(2, 5) == 10);
    }


}
