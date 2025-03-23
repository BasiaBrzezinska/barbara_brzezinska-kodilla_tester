package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public Person (String firstName, int age, String job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void introducePerson (){
        System.out.println("She/He is " + firstName + " she/he' s "+ age + " years old "+ " and she/he is a " + job);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Damian", 33, "doctor");
        Person person2 = new Person("Anna", 38, "teacher");
        Person person3 = new Person("Laura", 40, "lawyer");
        Person person4 = new Person("Artur", 29, "fireman");

        Job doctor = new Doctor();
        Job teacher =  new Teacher();
        Job lawyer  = new Lawyer();
        Job fireman = new Fireman();

       person1.introducePerson();doctor.showResponsibilities();
       person2.introducePerson();teacher.showResponsibilities();
       person3.introducePerson();lawyer.showResponsibilities();
       person4.introducePerson();fireman.showResponsibilities();


    }
}
