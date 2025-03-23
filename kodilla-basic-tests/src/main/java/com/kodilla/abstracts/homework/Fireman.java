package com.kodilla.abstracts.homework;

public class Fireman extends Job {

    public Fireman( ) {
        super(7.000, "Firefighting and rescuing people");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("His responsibilities are: "+ responsibilities);
    }
}
