package com.kodilla.exception.homework;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Werehouse {
    private Set <Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order= orders
                .stream()
                .filter( o -> o.getNumber().equals(number))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());
        return order;
    }
}


