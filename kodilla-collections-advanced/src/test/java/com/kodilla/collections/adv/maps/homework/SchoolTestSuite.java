package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTestSuite {

    @Test
    void testTotalNumbersStudentInSchool() {
        School school = new School(Arrays.asList(10, 20, 30));
        assertEquals(60, school.totalNumbersStudentInSchool());
    }

    @Test
    void testTotalNumbersStudentInSchoolWithEmptyList() {
        School school = new School(Collections.emptyList());
        assertEquals(0, school.totalNumbersStudentInSchool());
    }

    @Test
    void testTotalNumbersStudentInSchoolWithSingleValue() {
        School school = new School(Collections.singletonList(15));
        assertEquals(15, school.totalNumbersStudentInSchool());
    }
}

