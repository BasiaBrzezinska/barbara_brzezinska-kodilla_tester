package com.kodilla.mockito.homework;

import java.util.Objects;

public class WeatherNotification {

    private String massage;

    public WeatherNotification(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WeatherNotification that = (WeatherNotification) o;
        return Objects.equals(massage, that.massage);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(massage);
    }
}
