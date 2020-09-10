package com.CalculatorTest;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
    @Test
    public void testAddPass() {
        int a = 5;
        int b = 4;
        int expected = 9;
        int res = com.CalculatorDemo.Calculator.addition(a, b);
        assertEquals(expected, res);
    }
    @Test
    public void testSubPass() {
        int a = 5;
        int b = 4;
        int expected = 1;
        int res= com.CalculatorDemo.Calculator.sub(a, b);
        assertEquals(expected, res);
    }
    @Test
    public void testMulPass() {
        int a = 5;
        int b = 4;
        int expected = 20;
        int res = com.CalculatorDemo.Calculator.mul(a, b);
        assertEquals(expected, res);
    }
    @Test
    public void testDivPass() {
        int a = 5;
        int b = 4;
        int expected = 1;
        int res = com.CalculatorDemo.Calculator.div(a, b);
        assertEquals(expected, res);
    }
}