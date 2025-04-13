package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTestSuit {

   @Test
   public void testAveragePostOlderUsers (){
       //given
       List<User> testUsers = new ArrayList<>();
       testUsers.add(new User("Alicja", 50, 10, "techaer"));
       testUsers.add(new User("Anna", 45, 18, "lawyer"));
       testUsers.add(new User("Michał", 39, 66, "fireman"));
       //when
       double result = ForumStats.averagePostOlderUsers(testUsers);
       //then
       assertEquals(14, result);
   }

   @Test
    public void testAveragePostOlderUsersWith40YearsOldUser (){
       //given
       List<User> testUsers = new ArrayList<>();
       testUsers.add(new User("Alicja", 40, 10, "techaer"));
       testUsers.add(new User("Anna", 40, 2, "lawyer"));
       testUsers.add(new User("Michał", 39, 66, "fireman"));
       //when
       double result = ForumStats.averagePostOlderUsers(testUsers);
       //then
       assertEquals(6.0, result);
   }

    @Test
    public void testAveragePostOlderUsersWhenAreNotOlder () {
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Alicja", 20, 4, "techaer"));
        testUsers.add(new User("Anna", 34, 2, "lawyer"));
        testUsers.add(new User("Michał", 39, 66, "fireman"));
        //when
        double result = ForumStats.averagePostOlderUsers(testUsers);
        //then
        assertEquals(0.0, result);
    }

    @Test
    public void testAveragePostYoungerUsers (){
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Alicja", 50, 10, "techaer"));
        testUsers.add(new User("Anna", 25, 12, "lawyer"));
        testUsers.add(new User("Michał", 39, 8, "fireman"));
        //when
        double result = ForumStats.averagePostYoungerUsers(testUsers);
        //then
        assertEquals(10, result);
    }

    @Test
    public void testAveragePostYoungerUsersWith40YearsOldUsers(){
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Alicja", 40, 10, "techaer"));
        testUsers.add(new User("Anna", 25, 12, "lawyer"));
        testUsers.add(new User("Michał", 40, 8, "fireman"));
        //when
        double result = ForumStats.averagePostYoungerUsers(testUsers);
        //then
        assertEquals(12, result);
    }

    @Test
    public void testAveragePostYoungerUsersWhereAreNotYounder(){
        //given
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Alicja", 40, 10, "techaer"));
        testUsers.add(new User("Anna", 55, 12, "lawyer"));
        testUsers.add(new User("Michał", 41, 8, "fireman"));
        //when
        double result = ForumStats.averagePostYoungerUsers(testUsers);
        //then
        assertEquals(0.0, result);
    }
}
