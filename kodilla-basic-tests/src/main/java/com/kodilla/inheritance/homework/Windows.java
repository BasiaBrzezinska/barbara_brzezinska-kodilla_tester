package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows (int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("System Windows jest włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("System Windows jest wyłączony");
    }
}
