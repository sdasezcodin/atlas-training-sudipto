package com.microservice;

class InventoryService {
    public boolean checkStock(String productId, int qty) {
        System.out.println("Checking stock for product " + productId);
        return qty <= 5;
    }
}
