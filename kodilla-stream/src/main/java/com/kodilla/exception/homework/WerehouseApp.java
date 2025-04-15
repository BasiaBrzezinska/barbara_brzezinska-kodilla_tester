package com.kodilla.exception.homework;

public class WerehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {

        Werehouse werehouse = new Werehouse();
        werehouse.addOrder(new Order("1"));
        werehouse.addOrder(new Order("2"));
        werehouse.addOrder(new Order("3"));

        try {
            werehouse.getOrder("5");
            System.out.println("Thank you for placing an order");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order number doesn't exist in our base");
        } finally {
            System.out.println("Thank you for using our app");
        }

    }

}
