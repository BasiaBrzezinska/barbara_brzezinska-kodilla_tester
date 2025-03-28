package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void showResponsibilities (Job job){
        System.out.println("Obowiązki na danym stanowisku to "+ job.getResponsibilities());
    }

    public static void main(String[] args) {

       Person person1 = new Person("Damian", 33, new Doctor());//
       Person person2 = new Person("Anna", 38, new Teacher());
       Person person3 = new Person("Laura", 40, new Lawyer());
       Person person4 = new Person("Artur", 29, new Fireman());

        Job doctor = new Doctor();
        Job teacher =  new Teacher();
        Job lawyer  = new Lawyer();
        Job fireman = new Fireman();

        person1.showResponsibilities(doctor);
        person2.showResponsibilities(teacher);
        person3.showResponsibilities(lawyer);
        person4.showResponsibilities(fireman);


    }
}
