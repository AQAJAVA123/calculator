package org.example.calculator;


import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
        calculator = new Calculator();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    @DataProvider(name = "add")
    public Object[][] add() {
        return new Object[][]{
                {2, 3, 5},
                {-1, 1, 0},
                {0, 0, 0}
        };
    }
    @Test(dataProvider = "add")
    public void testAdd(int a, int b, int expected) {
        assertEquals(calculator.add(a, b), expected);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculator.subtract(5, 2), 3);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculator.multiply(4, 3), 12);
    }

    @Test(dependsOnMethods = "testMultiply")
    public void testDivide() {
        assertEquals(calculator.divide(10, 2), 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(0, 0);
    }
}
