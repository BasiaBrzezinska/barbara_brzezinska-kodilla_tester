package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> directorsSchool = new HashMap<>();
        Principal kowalski = new Principal("Kowalski", "School number 1");
        Principal buczynski = new Principal("Buczynski", "School number 2");
        Principal konieczna = new Principal("Konieczna", "School number 3");
        Principal najdek = new Principal("Najdek", "School number 4");

        School number1 = new School(Arrays.asList(26,31,25,23,24));
        School number2 = new School(Arrays.asList(28,32,27,25,29));
        School number3 = new School(Arrays.asList(25,31,29,33,25));
        School number4 = new School(Arrays.asList(21,24,27,23,25));

        directorsSchool.put(kowalski, number1);
        directorsSchool.put(buczynski, number2);
        directorsSchool.put(konieczna, number3);
        directorsSchool.put(najdek, number4);

        for (Map.Entry<Principal, School> informationSchool : directorsSchool.entrySet()) {
            System.out.println("Mr : " + informationSchool.getKey().name + " is the director of : "
                    + informationSchool.getKey().school + " The total number of students in this school is: " +
                    informationSchool.getValue().totalNumbersStudentInSchool());}

    }
}
