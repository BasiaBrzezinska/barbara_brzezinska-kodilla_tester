package com.kodilla.abstracts.homework;

public class Fireman extends Job {

    public Fireman( ) {
        super("Gaszenie pożarów", 7.000);
    }

    @Override
    public String getResponsibilities (){
        return "Gaszenie pożarów";
    }

}
