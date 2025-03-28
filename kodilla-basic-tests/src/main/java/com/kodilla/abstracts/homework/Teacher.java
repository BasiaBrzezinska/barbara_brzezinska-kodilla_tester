package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher( ) {
        super("Uczenie dzieci i młodzież w szkole", 6.000);
    }

    @Override
    public String getResponsibilities (){
        return "Uczenie dzieci w szkole";
    }

}
