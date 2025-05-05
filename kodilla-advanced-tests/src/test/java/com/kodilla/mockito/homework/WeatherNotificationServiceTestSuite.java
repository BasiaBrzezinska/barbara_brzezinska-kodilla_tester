package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.never;

public class WeatherNotificationServiceTestSuite {

    WeatherNotificationService service = new WeatherNotificationService();
    Person person = Mockito.mock(Person.class);
    Person person1 = Mockito.mock(Person.class);
    Person person2 = Mockito.mock(Person.class);
    Location location1 = new Location("Wroclaw");
    Location location2 = new Location("Paris");
    Location location3 = new Location("Madrid");
    WeatherNotification notification = new WeatherNotification("Hot wave");
    WeatherNotification notificationToAll = new WeatherNotification("New subscription conditions");
    WeatherNotification notification1 = new WeatherNotification("Will be raining");
    WeatherNotification notification2 = new WeatherNotification("Windy day");
    WeatherNotification notification3 = new WeatherNotification("Hot wave");

    @Test
    public void shouldAddSubscriberAndGetNotification(){
       //when
        service.addSubscriber(location1, person);
        service.sendNotificationToLocation(location1, notification);
        //then
        Mockito.verify(person).receive(notification);
    }

    @Test
    public void shouldRemoveSubscriberAndThenNotSendNotification(){
        //when
        service.addSubscriber(location1, person);
        service.removeSubscriber(location1, person);
        service.sendNotificationToLocation(location1, notification);
        //then
        Mockito.verify(person, never()).receive(notification);
    }

    @Test
    public void shouldRemoveSubscriberFromAllSubscribedLocation(){
        //when
        service.addSubscriber(location1, person);
        service.addSubscriber(location2, person);
        service.addSubscriber(location3, person);

        service.removePersonFromAllLocation(person);
        service.sendNotificationToLocation(location1, notification);
        service.sendNotificationToLocation(location2, notification);
        service.sendNotificationToLocation(location3, notification);
        //then
        Mockito.verify(person, never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToAllSubscriber (){
        //when
        service.addSubscriber(location1, person);
        service.addSubscriber(location2, person);
        service.addSubscriber(location3, person1);
        service.addSubscriber(location1, person2);
        service.sendNotificationToAll(notificationToAll);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(notificationToAll);
        Mockito.verify(person1, Mockito.times(1)).receive(notificationToAll);
        Mockito.verify(person2, Mockito.times(1)).receive(notificationToAll);
    }

    @Test
    public void shouldRemoveLocation (){ //ten nie przechodzi i nie wiem dlaczego
       //given
        service.addSubscriber(location1, person);
        service.addSubscriber(location2, person);
        service.addSubscriber(location3, person);
        //when
        service.removeLocation(location1);
        service.sendNotificationToLocation(location1, notification1);
        service.sendNotificationToLocation(location2, notification2);
        service.sendNotificationToLocation(location3, notification3);
        //then
        Mockito.verify(person, never()).receive(notification1);
        Mockito.verify(person, Mockito.times(1)).receive(notification2);
        Mockito.verify(person, Mockito.times(1)).receive(notification3);

    }
}
