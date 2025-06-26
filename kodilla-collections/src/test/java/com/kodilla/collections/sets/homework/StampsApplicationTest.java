package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StampsApplicationTest {

    @Test
    void testSetBehaviorWithDuplicateStamps() {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Motyl", 5, true));
        stamps.add(new Stamp("Samolot", 3, false));
        stamps.add(new Stamp("Drzewo", 5, true));
        stamps.add(new Stamp("Motyl", 5, true)); // duplikat
        stamps.add(new Stamp("Samolot", 3, false)); // duplikat
        stamps.add(new Stamp("Wieża", 3, true));
        stamps.add(new Stamp("Samolot", 3, false)); // duplikat


        assertEquals(4, stamps.size());

        assertTrue(stamps.contains(new Stamp("Motyl", 5, true)));
        assertTrue(stamps.contains(new Stamp("Samolot", 3, false)));
        assertTrue(stamps.contains(new Stamp("Drzewo", 5, true)));
        assertTrue(stamps.contains(new Stamp("Wieża", 3, true)));
    }
}
