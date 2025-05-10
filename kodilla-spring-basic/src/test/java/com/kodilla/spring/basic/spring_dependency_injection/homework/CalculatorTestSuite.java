package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnCorrectSumResult (){
        double result = bean.add(2,2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void shouldReturnCorrectSubtractResult (){
        double result = bean.subtract(10, 7);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldReturnCorrectMultiplyResult () {
        double result = bean.multiply(2, 2);
        Assertions.assertEquals(4, result);

    }

    @Test
    public void shouldReturnCorrectDivideResult (){
        double result = bean.divide(9,3);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void shouldNotDivideByZero (){
        double result = bean.divide(10,0);
        Assertions.assertTrue(Double.isNaN(result));
    }

}
