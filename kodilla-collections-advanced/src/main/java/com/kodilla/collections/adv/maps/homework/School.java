package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> studentsNumber = new ArrayList<>();

    public School (List<Integer> studentsNumber){
        this.studentsNumber = studentsNumber;
    }

    public List<Integer> getStudentsNumber() {
        return studentsNumber;
    }

    public int totalNumbersStudentInSchool (){
        int sum = 0;
        for (int number : studentsNumber){
            sum = sum + number;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsNumber=" + studentsNumber +
                '}';
    }
}
