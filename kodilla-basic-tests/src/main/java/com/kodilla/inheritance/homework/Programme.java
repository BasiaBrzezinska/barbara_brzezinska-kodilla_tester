package com.kodilla.inheritance.homework;

public class Programme {

    public static void main (String[] args){

        Windows windows = new Windows(1985);
        System.out.println("The first Windows operating system was created in " + windows.getYear());
        windows.turnOff();
        windows.turnOn();

        MacOs macOs = new MacOs(1984);
        System.out.println("The first MacOs system was created in "+ macOs.getYear());
        macOs.turnOff();
        macOs.turnOn();
    }
}
