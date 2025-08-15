package com.strategy;

class PaymentContext {
    private PaymentStrategy strategy;

    // Change payment method at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payBill(int amount) {
        if (strategy == null) {
            System.out.println("Please select a payment method first!");
        } else {
            strategy.pay(amount);
        }
    }
}

