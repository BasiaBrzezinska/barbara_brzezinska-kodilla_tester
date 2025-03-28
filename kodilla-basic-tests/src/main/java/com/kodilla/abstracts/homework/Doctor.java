package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor() {
        super("Lecznie pacjentów", 10.000);

    }

    @Override
    public String getResponsibilities (){
        return "Lecznie pacjentów";
    }

}
