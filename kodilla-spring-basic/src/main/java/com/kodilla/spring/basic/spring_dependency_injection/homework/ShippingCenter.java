package com.kodilla.spring.basic.spring_dependency_injection.homework;


import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {


    @Resource (name = "notification")
    private NotificationService notificationService;

    @Resource (name = "delivery")
    private DeliveryService deliveryService;


    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}

