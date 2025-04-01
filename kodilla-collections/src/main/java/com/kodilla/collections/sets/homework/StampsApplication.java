package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Motyl", 5, true));
        stamps.add(new Stamp("Samolot", 3, false));
        stamps.add(new Stamp("Drzewo", 5, true));
        stamps.add(new Stamp("Motyl", 5, true));
        stamps.add(new Stamp("Samolot", 3, false));
        stamps.add(new Stamp("Wieża", 3, true));
        stamps.add(new Stamp("Samolot", 3, false));

        System.out.println("Collection size: " + stamps.size());

        for (Stamp stamp : stamps){
            System.out.println(stamp);
        }

    }
}
