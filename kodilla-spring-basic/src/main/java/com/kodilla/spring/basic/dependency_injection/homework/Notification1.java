package com.kodilla.spring.basic.dependency_injection.homework;


import org.springframework.stereotype.Component;

@Component
public class Notification implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}
