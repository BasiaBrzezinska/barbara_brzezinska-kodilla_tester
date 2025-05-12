package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;


@Configuration
public class CarChosen {

    @Bean
    public Car chooseCar (){
        boolean headlightsOn = isHeadlightsOn();

        Month month = LocalDate.now().getMonth();
        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return new SUV(headlightsOn);
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY || month == Month.SEPTEMBER || month == Month.OCTOBER || month == Month.NOVEMBER) {
            return new Sedan(headlightsOn);
        } else
            return new Cabrio(headlightsOn);
    }

    private boolean isHeadlightsOn() {
        int hour = LocalTime.now().getHour();

        if (hour >= 20 || hour < 6) {
            return true;
        } else {
            return false;
        }
    }

}
