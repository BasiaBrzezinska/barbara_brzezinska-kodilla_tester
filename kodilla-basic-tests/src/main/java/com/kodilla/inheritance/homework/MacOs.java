package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {

    public MacOs (int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("System macOs jest włączony");

    }

    @Override
    public void turnOff() {
        System.out.println("System macOs jest wyłączony ");

    }

}
