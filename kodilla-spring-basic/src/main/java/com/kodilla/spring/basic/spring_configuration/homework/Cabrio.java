package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {

    private boolean headlightsOn;

    public Cabrio (boolean headlightsOn){
        this.headlightsOn = headlightsOn;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
            return headlightsOn;
        }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
