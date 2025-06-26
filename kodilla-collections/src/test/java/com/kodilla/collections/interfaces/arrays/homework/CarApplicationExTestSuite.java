package com.kodilla.collections.interfaces.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarApplicationExTestSuite {

    @Test
    void testGetRandomSpeedInRange() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int speed = CarApplicationEx.getRandomSpeed(random);
            assertTrue(speed >= 50 && speed <= 199, "Speed should be in range 50-199, and is: " + speed);
        }
    }

    @Test
    void testDrawnCarReturnsValidCar() {
        for (int i = 0; i < 1000; i++) {
            Car car = CarApplicationEx.drawnCar();
            assertNotNull(car);
            assertTrue(
                    car instanceof Ford || car instanceof Kia || car instanceof Mercedes,
                    "Unexpected car type: " + car.getClass().getSimpleName()
            );
            assertTrue(car.getSpeed() >= 50 && car.getSpeed() <= 199);
        }
    }
}
