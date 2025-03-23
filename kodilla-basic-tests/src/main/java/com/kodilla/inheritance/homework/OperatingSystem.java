package com.kodilla.inheritance.homework;

public abstract class OperatingSystem {
    private int year;

    public OperatingSystem (int year){
        this.year = year;
    }

    public abstract void turnOn ();

    public abstract void turnOff ();

    public int getYear (){
        return year;
    }
}
