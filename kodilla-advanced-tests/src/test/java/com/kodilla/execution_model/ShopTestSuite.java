package com.kodilla.execution_model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(90, LocalDate.of(2023, 9, 11 ), "user1");
    Order order2 = new Order(70, LocalDate.of(2024, 1, 11), "user2");
    Order order3 = new Order(88, LocalDate.of(2025, 6, 23), "user3");

    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrderToSet(){
        //when
        int numberOfOrders = shop.getNumbersOfOrders();
        //then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void shouldGetOrdersBetweenDates(){
        //when
        List<Order> orders = shop.getOrdersBetweenDate(LocalDate.of(2023,9,11), LocalDate.of(2024,1,11));
        //then
        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order2));
    }

    @Test
    public void shouldGetOrdersExactlyOnStartAndEndDay (){
        //when
        List<Order> orders = shop.getOrdersBetweenDate(LocalDate.of(2023, 9, 11), LocalDate.of(2025, 6, 23) );
        //then
        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order3));
    }


    @Test
    public void shouldSumOfTotalValuesOrders(){
        //when
       double sumValuesOrder = shop.sumOfTotalValuesOrders();
       //then
       assertEquals(248, sumValuesOrder, 0.01);

    }

    @Test
    public void shouldGetOrdersByPriceRange (){
        //when
        List<Order> orders = shop.getOrdersByPriceRange(70, 100);
        //then
        assertTrue(orders.contains(order3));
        assertTrue(orders.contains(order1));
    }

    @Test
    public void shouldGetOrderExactlyOnMinAndMaxValue (){
        //when
        List<Order> orders = shop.getOrdersByPriceRange(70, 90);
        //
        assertTrue(orders.contains(order2));
        assertTrue(orders.contains(order1));
    }
}