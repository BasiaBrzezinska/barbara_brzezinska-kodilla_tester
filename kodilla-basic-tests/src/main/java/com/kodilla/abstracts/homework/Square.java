package com.kodilla.abstracts.homework;

public class Square extends Shape {
    double a;


    public Square (double a){
        this.a = a;

    }

    @Override
    public double surfaceArea() {
        return a * a;
    }

    @Override
    public double circumference() {
        return 4*a;
    }
}
