package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car ford = new Ford(0);
        doRace(ford);

        Car kia = new Kia(0);
        doRace(kia);

        Car mercedes = new Mercedes(0);
        doRace(mercedes);

    }

    public static void doRace (Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Final speed car is "+ car.getSpeed() + "km/h");
    }
}
