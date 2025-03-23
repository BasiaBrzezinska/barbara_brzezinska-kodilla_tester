package com.kodilla.abstracts.homework;

public class Doctor extends Job{

    public Doctor() {
        super(10.000, "Patients care and treatment");

    }

    @Override
    public void showResponsibilities () {
        System.out.println("His responsibilities are: "+ responsibilities);
    }
}
