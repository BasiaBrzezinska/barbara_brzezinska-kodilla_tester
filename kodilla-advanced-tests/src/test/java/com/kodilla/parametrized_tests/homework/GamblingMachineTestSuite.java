package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    //testy do validateNumbers
    @ParameterizedTest
    @CsvFileSource (resources = "/numbersOutOfScope.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionIfNumbersAreOutOfScope(String csvNumbers) {
        Set<Integer> numbers = Arrays.stream(csvNumbers.split(","))
                .map(s->Integer.parseInt(s))
                .collect(Collectors.toSet());

        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, ()-> gamblingMachine.validateNumbers(numbers));
    }

    @ParameterizedTest //ten test nie przechodzi, żle zczytuje mi dane z pliku csv i nie wiem dlaczego...
    @CsvFileSource (resources = "/numbersInScope.csv", numLinesToSkip = 0)
    public void shouldNotThrowExceptionNumbersInScope (String csvNumbers){
        Set<Integer> numbers = Arrays.stream(csvNumbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        GamblingMachine gamblingMachine = new GamblingMachine();
        assertDoesNotThrow(()->gamblingMachine.validateNumbers(numbers));
    }

}