package com.microservice;

class OrderService {
    private InventoryService inventoryService = new InventoryService(); // in real life, REST call

    public String placeOrder(String productId, int qty) {
        if (inventoryService.checkStock(productId, qty)) {
            return "Order placed for " + qty + " units of " + productId;
        } else {
            return "Not enough stock for product " + productId;
        }
    }
}
