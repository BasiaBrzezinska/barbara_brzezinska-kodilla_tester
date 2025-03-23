package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuit {

    @Test

    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        assertEquals (13, sumResult );

    }

    @Test
    public void testSubtract (){
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(3,subtractResult);
    }
    @Test
    public void testPowerPositiveNumber (){
        Calculator calculator = new Calculator();
        double base = 2.0;
        double exponent = 2.0;
        double powerResult = calculator.power(base,exponent);
        assertEquals(4.0, powerResult, 0.0001);

    }

    @Test
    public void testPowerNegativeNumber (){
        Calculator calculator = new Calculator();
        double base = -2.0;
        double exponent = 2.0;
        double powerResult = calculator.power(base,exponent);
        assertEquals(4.0, powerResult, 0.0001);
    }

    @Test
    public void testPowerZeroNumber (){
        Calculator calculator = new Calculator();
        double base = 0.0;
        double exponent = 2.0;
        double powerResult = calculator.power(base,exponent);
        assertEquals(0.0, powerResult, 0.0001);
    }


}
