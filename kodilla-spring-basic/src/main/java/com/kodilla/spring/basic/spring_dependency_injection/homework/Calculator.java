package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
public class Calculator {

    private Display display;

    public Calculator (Display display){
        this.display = display;
    }

    public double add (double a, double b) {
        double sum = a + b;
        display.display(sum);
        return sum;
    }

    public double subtract (double a, double b){
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiply (double a, double b){
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide (double a, double b) {
        if (b == 0) {
            display.displayError("You can not divide by 0");
            return Double.NaN;
        }
            double result = a / b;
            display.display(result);
            return result;
    }

}

