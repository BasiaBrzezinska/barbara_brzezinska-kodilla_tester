package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class GradesTestSuite {
    @Test
    void testAverage() {
        Grades grades = new Grades(Arrays.asList(5.0, 4.0, 3.0));
        assertEquals(4.0, grades.getAverage(), 0.01);
    }

}