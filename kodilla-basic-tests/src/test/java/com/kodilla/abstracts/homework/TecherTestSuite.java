package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TecherTestSuite {

    @Test
    void shouldReturnCorrectResponsibilitiesAndSalary() {
        Job techer = new Teacher();

        assertEquals("Uczenie dzieci i młodzież w szkole", techer.getResponsibilities());
        assertEquals(6.000, techer.getSalary());
    }
}
