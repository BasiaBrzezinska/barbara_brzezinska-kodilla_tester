package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiremanTestSuite {

    @Test
    void shouldReturnCorrectResponsibilitiesAndSalary() {
        Job fireman = new Fireman();

        assertEquals("Gaszenie pożarów", fireman.getResponsibilities());
        assertEquals(7.000, fireman.getSalary());
    }
}
