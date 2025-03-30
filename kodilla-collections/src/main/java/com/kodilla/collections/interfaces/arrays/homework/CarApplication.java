package com.kodilla.collections.interfaces.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarApplication {

    public static void main (String[] args){
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
           cars [n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar (){
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        double a = getRandomSize (random);
        if (drawnCarBrand == 0)
            return new Ford(80);
        else if (drawnCarBrand == 1)
            return new Kia(90);
        else {
            double b = getRandomSize (random);
            double c = getRandomSize (random);
            return new Mercedes(120);
        }
    }

    private static double getRandomSize(Random random) {
        return random.nextDouble() * 100 + 1;
    }

    }
