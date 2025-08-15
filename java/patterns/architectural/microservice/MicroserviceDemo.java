package com.microservice;

public class MicroserviceDemo {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        System.out.println(orderService.placeOrder("P1001", 3));
    }
}
