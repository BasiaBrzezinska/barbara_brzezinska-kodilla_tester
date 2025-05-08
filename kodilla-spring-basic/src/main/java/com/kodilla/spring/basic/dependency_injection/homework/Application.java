package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new Delivery();
        NotificationService notificationService = new Notification();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        shippingCenter.sendPackage("Hill street 11, New York", 33);
        shippingCenter.sendPackage("Wall Street 20, New York", 12.2);
    }
}
