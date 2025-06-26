package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LawyerTestSuite {

    @Test
    void shouldReturnCorrectResponsibilitiesAndSalary() {
        Job lawyer = new Lawyer();

        assertEquals("Reprezentowanie klientów w sądzie", lawyer.getResponsibilities());
        assertEquals(15.000, lawyer.getSalary());
    }
}
