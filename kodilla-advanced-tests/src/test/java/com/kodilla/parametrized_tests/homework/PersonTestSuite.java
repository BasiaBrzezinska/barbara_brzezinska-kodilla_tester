package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

@ParameterizedTest
@MethodSource (value = "com.kodilla.parametrized_tests.homework.PersonBMISources#provideDataForTestingBMI")
    public void shouldReturnCorrectCategoryAboutBMI (double weight, double height, String expectedCategory){
    Person person = new Person(weight, height);

    String resultCategory = person.getBMI();

    assertEquals(expectedCategory, resultCategory);
}

}