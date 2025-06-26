package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoctorTestSuite {

    @Test
    void shouldReturnCorrectResponsibilitiesAndSalary() {
        Job doctor = new Doctor();

        assertEquals("Leczenie pacjentów", doctor.getResponsibilities());
        assertEquals(10.000, doctor.getSalary());
    }
}

