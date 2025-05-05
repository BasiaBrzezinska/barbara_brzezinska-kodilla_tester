package com.kodilla.mockito.homework;

import com.kodilla.mockito.homework.WeatherNotification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    Map<Location, Set<Person>> subscriptions = new HashMap<>();

    public void addSubscriber(Location location, Person person) {
        if (!subscriptions.containsKey(location)){
        subscriptions.put(location, new HashSet<>());
       }
        subscriptions.get(location).add(person);
    }

    public void removeSubscriber (Location location, Person person){
        if (subscriptions.containsKey(location)){
            subscriptions.get(location).remove(person);
        }
    }

    public void removePersonFromAllLocation (Person person) {
        for (Set<Person> people : subscriptions.values()){
            if (people.contains(person)) {
                people.remove(person);
            }
        }
    }

    public void sendNotificationToLocation (Location location, WeatherNotification weatherNotification){
        if (subscriptions.containsKey(location)){
            subscriptions.get(location).forEach(person -> person.receive(weatherNotification));
        }
    }

    public void sendNotificationToAll (WeatherNotification weatherNotification){
        Set<Person> allPeople = new HashSet<>();
        for (Set <Person> people : subscriptions.values()){
            allPeople.addAll(people);
        }
        allPeople.forEach(person -> person.receive(weatherNotification));
    }

    public void removeLocation (Location location){
        subscriptions.remove(location);
    }

}
