package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarChosenTestSuite {

    @Autowired
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
    Car car = (Car) context.getBean("chooseCar");


    @Test
    public void shouldGetCarTypeDependsOnSeason() {
        //when
        String carType = car.getCarType();
        //then
        Assertions.assertTrue(carType.equals("SUV") || carType.equals("Sedan") || carType.equals("Cabrio"));
    }

    @Test
    public void shouldHaveTurnLightsOnDuringNight() {
        //given
        int hour = LocalTime.now().getHour();
        boolean night = hour >= 20 || hour <= 6;
        //when
        boolean headLightsOn = car.hasHeadlightsTurnedOn();
        //then
        Assertions.assertEquals(night, headLightsOn);

    }

}