package com.kodilla.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearTestSuite {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400 (){
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        Assertions.assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4ButNotBy100 (){
        //given
        Year year = new Year(2024);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        Assertions.assertTrue(isLeapYear);
    }

    @Test
    public void schouldNotBeLeapYearIfDivisibleBy100ButNotBy400 (){
        //given
        Year year = new Year(1900);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        Assertions.assertFalse(isLeapYear);
    }

    @Test
    public void schouldNotBeLeapYearIfIsNotDivisibleBy4 (){
        //given
        Year year = new Year(2023);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        Assertions.assertFalse(isLeapYear);
    }
}
