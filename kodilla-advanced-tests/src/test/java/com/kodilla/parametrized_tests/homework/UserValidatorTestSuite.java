package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();


    //testy do metody validateUserName()
    @ParameterizedTest
    @ValueSource (strings = {"gutek12", "Adam.990", "Ag_Ata...44", "SAMA-TA"})
    public void shouldReturnTrueIfIsMatchesToRegex (String name){
        boolean result = userValidator.validateUserName(name);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"AS@$", "!@#", "*45^^^"} )
    public void shouldReturnFalseIfAreUsingCharsNotMatchingToRegex (String name){
        boolean result = userValidator.validateUserName(name);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfIsNull (String name){ //ten test nie przechodzi...NullPointerException,
        // przeszedł jak do metody validateUserName dodałam warunek: null!=username.
        assertFalse(userValidator.validateUserName(name));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfNameIsEmpty (String name){
        assertFalse(userValidator.validateUserName(name));
    }

    //testy do metody validateEmail()
    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull (String email){
        assertFalse(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfEmailIsEmpty (String email){ //czyli regex do maila dopuszcza pustego maila, dlaczego?
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"pyskaty123.kowalski@gmail.com", "agata_kowalski@wp.pl", "ChUdY_-56@onet.eu"})
    public void shouldReturnTrueIfEmailMatchesToRegex (String email){
        assertTrue(userValidator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"#$asia@wp.pl", "Kropka&*@Gmail.com", "K  -sia@onet.eu"})
    public void shouldReturnFalseIfEmailNotMatchesToRegex (String email) {
        assertFalse(userValidator.validateEmail(email));
    }


}