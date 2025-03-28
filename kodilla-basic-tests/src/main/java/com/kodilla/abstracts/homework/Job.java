package com.kodilla.abstracts.homework;

public abstract class Job {
     private String responsibilities;
     private double salary;

    public Job (String responsibilities, double salary){
        this.responsibilities = responsibilities;
        this.salary = salary;

    }

    public String getResponsibilities (){
        return responsibilities;
    }

    public double getSalary(){
      return salary;
    }

}

