package com.kodilla.collections.interfaces.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.CarRace;

import java.text.MessageFormat;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("..............................");
        System.out.println("Car brand " + getCarName(car));
        System.out.println("Car is driving with speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Mercedes)
            return "Mercedes";
        else
            return "Unknown brand";
    }
}

