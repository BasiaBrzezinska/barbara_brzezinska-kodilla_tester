package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    public Set <Integer> changeStringToInteger(String numbersCsv) {
        String[] split = numbersCsv.split(",");
        Set<Integer> numbers = new HashSet<>();
        for (String number : split) {
            int number1 = Integer.parseInt(number);
            numbers.add(number1);
        }
        return numbers;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOutOfScope.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenAreLessNumberThan6 (String numbersCsv) {
        //when
        Set <Integer> numbers = changeStringToInteger(numbersCsv);
        //then
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/moreThan6numbers.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenAreMoreThan6Numbers (String moreNumbers){
        //when
        Set<Integer> tooManyNumbers = changeStringToInteger(moreNumbers);
        //then
        assertThrows(InvalidNumbersException.class, () ->gamblingMachine.howManyWins(tooManyNumbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOutOfRange.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionWhenNumbersArentBetweenRange (String numbers){
        //when
        Set<Integer> numbersOutOfRange = changeStringToInteger(numbers);
        //then
        assertThrows(InvalidNumbersException.class, ()->gamblingMachine.howManyWins(numbersOutOfRange));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersInScope.csv", numLinesToSkip = 0)
    public void shouldNotThrowExceptionWhenNumbersAreInScope (String numbers){
        //when
        Set<Integer> correctNumbers = changeStringToInteger(numbers);
        //then
        assertDoesNotThrow( () -> gamblingMachine.howManyWins(correctNumbers));
    }
}