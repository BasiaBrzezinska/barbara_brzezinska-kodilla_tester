package com.kodilla.mockito.homework;

import java.util.Objects;

public class Location {

    private String locationName;

    public Location (String locationName){
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(locationName, location.locationName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(locationName);
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationName='" + locationName + '\'' +
                '}';
    }
}
