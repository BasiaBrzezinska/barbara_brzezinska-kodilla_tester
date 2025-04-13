package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Marcin", new Teacher("Pan Tomasz")));
        students.add(new Student("Anna", new Teacher("Pan Artur")));
        students.add(new Student("Marta", null));
        students.add(new Student("Agata", null));
        students.add(new Student("Nela", new Teacher("Pani Dominika")));
        students.add(new Student("Daria", new Teacher("Pani Ewa")));
        students.add(new Student("Edyta", null));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ",  nauczyciel: " + student.getTeacherName());

        }

    }
}