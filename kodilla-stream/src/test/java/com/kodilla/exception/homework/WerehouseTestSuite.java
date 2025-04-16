package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerehouseTestSuite {

    @Test
    public void testGetOrder () throws OrderDoesntExistException {//test przechodzi, ale sama nie wiem czy logika jest dobra.
        //given
        Werehouse werehouse = new Werehouse();
        Order expected = new Order("1");
        werehouse.addOrder(expected);
        //when
        Order result = werehouse.getOrder("1");
        //then
        assertEquals(expected, result);
    }



    @Test public void testGetOrder_withException (){
        //given
        Werehouse werehouse = new Werehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> werehouse.getOrder("6"));
    }

}