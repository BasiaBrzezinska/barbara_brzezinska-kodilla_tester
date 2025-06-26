package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ComplexMapExampleTestSuite {

    @Test
    void testSchoolMapContainsStudentsAndCorrectAverages() {
        Map<Student, Grades> school = new HashMap<>();
        Student s = new Student("Jan", "Kowal");
        Grades g = new Grades(Arrays.asList(3.0, 4.0, 5.0));
        school.put(s, g);

        assertTrue(school.containsKey(s));
        assertEquals(4.0, school.get(s).getAverage(), 0.01);
    }

}