package com.kodilla.abstracts.homework;

public class Lawyer extends Job{

    public Lawyer() {
        super(12.000, "Representing and defending his clients in court");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Her responsibilities are: "+ responsibilities);
    }
}
