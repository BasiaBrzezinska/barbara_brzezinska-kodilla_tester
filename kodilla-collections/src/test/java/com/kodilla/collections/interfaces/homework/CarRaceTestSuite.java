package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarRaceTestSuite {
    @Test
    void testDoRaceWithFord() {
        Car ford = new Ford(0);
        CarRace.doRace(ford);
        // 3x increaseSpeed (+30) = 90
        // 2x decreaseSpeed (-20) 90 - 40 = 50
        assertEquals(50, ford.getSpeed());
    }

    @Test
    void testDoRaceWithKia() {
        Car kia = new Kia(0);
        CarRace.doRace(kia);
        // 3x increaseSpeed (+35) = 105
        // 2x decreaseSpeed (-15) 105 - 30 = 75
        assertEquals(75, kia.getSpeed());
    }

}