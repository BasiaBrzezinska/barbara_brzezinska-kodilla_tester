package com.kodilla.execution_model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder (Order order){
        this.orders.add(order);
    }

    public List<Order> getOrdersBetweenDate (LocalDate from, LocalDate to){
        return orders.stream()
                .filter(order -> !order.getOrderDate().isBefore(from) && !order.getOrderDate().isAfter(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByPriceRange (double minValue, double maxValue) {
        return orders.stream()
                .filter(order ->order.getOrderPrice()>=minValue && order.getOrderPrice()<=maxValue )
                .collect(Collectors.toList());
    }

    public int getNumbersOfOrders (){
       return this.orders.size();
    }

    public double sumOfTotalValuesOrders (){
        return orders.stream()
                .mapToDouble(order -> order.getOrderPrice())
                .sum();
    }
}
