package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarListsApplication {
    public static void main(String[] args) {

        List <Car> cars = new ArrayList<>();
        cars.add(new Ford(120));
        cars.add(new Mercedes(100));
        cars.add(new Kia(90));

        Mercedes mercedes = new Mercedes(100);

        cars.remove(0);
        cars.remove(mercedes);

        for (Car car:cars ){
            CarUtils.describeCar(car);
        }

        System.out.println ("Number of objects in the collection: " + cars.size());
    }
}
