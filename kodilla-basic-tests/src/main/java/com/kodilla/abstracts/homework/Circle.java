package com.kodilla.abstracts.homework;

import java.util.PrimitiveIterator;

public class Circle extends Shape {
    static final double PI =3.1415927;
    double r;

    public Circle (double PI, double r){//dlaczego nie mogę przypisać PI?
        this.r = r;
    }


    @Override
    public double surfaceArea() {
        return PI * r * r;
    }

    @Override
    public double circumference() {
        return 2 * PI * r;
    }
}
