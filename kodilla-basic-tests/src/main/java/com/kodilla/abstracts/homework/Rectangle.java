package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double surfaceArea() {
        return a * b;
    }

    @Override
    public double circumference() {
        return 2 * (a + b);
    }
}
