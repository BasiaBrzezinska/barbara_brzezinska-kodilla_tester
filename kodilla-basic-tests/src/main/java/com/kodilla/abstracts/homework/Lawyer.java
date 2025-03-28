package com.kodilla.abstracts.homework;

public class Lawyer extends Job{

    public Lawyer() {
        super("Reprezentowanie klientów w sądzie", 15.000);
    }

    @Override
    public String getResponsibilities (){
        return "Obrona klientów w sądzie";
    }

}
