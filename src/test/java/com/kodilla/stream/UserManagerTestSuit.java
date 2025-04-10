package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTestSuit {


// sprawdzający czy metoda zwraca poprawne wartości username dla wszystkich użytkowników z grupy Chemists.
    @Test
    public void testFilterChemistGroupUsernames (){
        //given
        List<User> users = UserRepository.getUserList(); //tu chyba cos jest nie tak, bo nie wykorzystuje tych users
        //when
        List<String> result = UserManager.filterChemistGroupUsernames();
        //then
        List <String> expected = List.of("Walter White", "Gale Boetticher");
        assertEquals(expected, result);
    }

    //Napisz testy sprawdzające czy wszystkie zwrócone elementy posiadają wiek większy od podanej wartości.
    @Test
    public void testFilterAgeGroupUsernames() {
        //given
        List<User> users = UserRepository.getUserList();
        //when
        List<String> result = UserManager.filterAgeGroupUsernames(45);
        //then
        List<String> expected = List.of("Walter White", "Gus Firing", "Mike Ehrmantraut");
        assertEquals(expected, result);
    }
    //wiek przekracza wiek użytkowników
    @Test
    public void testFilterAgeGroupUsernamesIfAgeIsTooOld(){
        //given
        List <User> users = UserRepository.getUserList();
        //when
        List<String> result = UserManager.filterAgeGroupUsernames(70);
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterActiveGroupUsernames (){
        //given
        List <User> users = UserRepository.getUserList();
        //when
        List<String> result = UserManager.filterActiveGroupUsernames(100);
        //then
        List<String> expected = List.of("Jessie Pinkman", "Tuco Salamanca");
        assertEquals(expected, result);
    }

    //Gdy ilość postów przekracza istniejące
    @Test
    public void testFilterActiveGroupUsernamesWhereAreTooMuchPost (){
        //given
        List <User> users = UserRepository.getUserList(); //to chyba jest zbędne, tylko nie wiem dlaczego...?
        //when
        List<String> result = UserManager.filterActiveGroupUsernames(5000);
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterNoActivGroupUserage (){
        //given
        List <User> users = UserRepository.getUserList();
        //when
        List<Integer> result = UserManager.filterNoActivGroupUserAge(10);
        //then
        List<Integer> expected = List.of(50,49,44,57);
        assertEquals(expected, result);
    }
    //gdy ilość postów jest mniejsza niż rzeczywista
    @Test
    public void testFilterNoActivGroupUserAgeIfAreLessPost(){
        //given
        List <User> users = UserRepository.getUserList();
        //when
        List<Integer> result = UserManager.filterNoActivGroupUserAge(-1);
        //then
        assertEquals(0, result.size());

    }
}