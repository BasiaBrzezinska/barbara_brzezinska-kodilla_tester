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
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse ("Undefined");
        //then
        String expected = "Undefined";
        String result = teacherName;
        assertEquals(expected, result);
    }

    @Test
    public void optionalStudentsAndTeacherListIfTeacherExists (){
        //given
        Student student = new Student("Anna", new Teacher("Pan Artur"));
        //when
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse ("Undefined");
        //then
        String expected = "Pan Artur";
        String result = teacherName;
        assertEquals(expected, result);
    }

}
