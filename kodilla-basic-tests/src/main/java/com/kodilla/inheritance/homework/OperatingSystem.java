package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem (int year){
        this.year = year;
    }

    public void turnOn (){
        System.out.println("Program is turn on");
    }

    public void turnOff (){
        System.out.println("Program is turn off.");
    }

    public int getYear (){
        return year;
    }
}
