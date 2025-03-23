package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher( ) {
        super(5.000, "Teaching children at school");
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Her responsibilities are: "+ responsibilities);
    }
}
