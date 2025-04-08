package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom () {
        //given
        List <Flight> flights = FlightRepository.getFlightTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        //when
        List <Flight> result = flightFinder.findFlightsFrom("Warsaw");
        //then
        List <Flight> expectedFlightFrom = new ArrayList<>();
        expectedFlightFrom.add(new Flight("Warsaw", "Madrid"));
        expectedFlightFrom.add(new Flight("Warsaw", "Berlin"));
        assertEquals(expectedFlightFrom, result);

    }

    @Test
    public void testFindFlightsTo (){
        //given
        List<Flight> flights = FlightRepository.getFlightTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        //when
        List<Flight> result = flightFinder.findFlightsTo("Madrid");
        //then
        List<Flight> expectedFlightTo = new ArrayList<>();
        expectedFlightTo.add(new Flight("Warsaw", "Madrid"));
        expectedFlightTo.add(new Flight("Paris", "Madrid"));
        assertEquals(expectedFlightTo, result);

    }

    @Test //gdy nie ma na liście takiego miasta
    public void testFindFlightsFromNoExistCity () {
        //given
        List <Flight> flights = FlightRepository.getFlightTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        //when
        List <Flight> result = flightFinder.findFlightsFrom("Oslo");
        //then
        assertEquals(0, result.size());
    }

    @Test //gdy nie ma na liście takiego miasta
    public void testFindFlightsToNoExistCity () {
        //given
        List <Flight> flights = FlightRepository.getFlightTable();
        FlightFinder flightFinder = new FlightFinder(flights);
        //when
        List <Flight> result = flightFinder.findFlightsTo("Chicago");
        //then
        assertEquals(0, result.size());
    }

}