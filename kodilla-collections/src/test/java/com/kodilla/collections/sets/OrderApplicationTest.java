package com.kodilla.collections.sets;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OrderApplicationTest {


    @Test
    void testSetBehaviorWithDuplicateOrders() {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1/2019", "Iron", 1.0));
        orders.add(new Order("2/2019", "Cutlery", 6.0));
        orders.add(new Order("3/2019", "Chair", 2.0));
        orders.add(new Order("1/2019", "Iron", 1.0)); // duplikat

        assertEquals(3, orders.size());

        assertTrue(orders.contains(new Order("1/2019", "Iron", 1.0)));
        assertTrue(orders.contains(new Order("2/2019", "Cutlery", 6.0)));
        assertTrue(orders.contains(new Order("3/2019", "Chair", 2.0)));
    }

}