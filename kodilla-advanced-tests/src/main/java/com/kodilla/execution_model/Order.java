package com.kodilla.execution_model;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double orderPrice;
    private LocalDate orderDate;
    private String customerLogin;

    public Order (double orderPrice, LocalDate orderDate, String customerLogin){
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.customerLogin = customerLogin;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(orderPrice, order.orderPrice) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(customerLogin, order.customerLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderPrice, orderDate, customerLogin);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderPrice=" + orderPrice +
                ", orderDate=" + orderDate +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }
}
