package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    //Klasę FlightRepository z metodą statyczną
    // getFlightsTable(), która zwraca listę lotów obsługiwanych przez dane lotnisko
    // (wypełnij tę listę przykładowymi lotami).

    public static List<Flight> getFlightTable() {
        List <Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Madrid"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Berlin", "Paris"));
        flights.add(new Flight("Paris", "London"));
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("Paris", "Madrid"));
        return flights;

    }
}