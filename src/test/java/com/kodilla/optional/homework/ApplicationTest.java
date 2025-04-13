package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ApplicationTest {

    @Test
    public void optionalStudentsAndTeacherListIfTeacherIsNull (){
        //given
        Student student = new Student("Edyta", null);
        //when
        student.getTeacherName();//to chyba teraz jest zbędne?
        //then
        String expected = "Undefined";
        String result = student.getTeacherName();
        assertEquals(expected, result);
    }

    @Test
    public void optionalStudentsAndTeacherListIfTeacherExists (){
        //given
        Student student = new Student("Anna", new Teacher("Pan Artur"));
        //when
        student.getTeacherName();
        //then
        String expected = "Pan Artur";
        String result = student.getTeacherName();
        assertEquals(expected, result);
    }

}
