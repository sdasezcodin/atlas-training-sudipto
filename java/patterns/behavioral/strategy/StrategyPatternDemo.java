package com.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9999-0000"));
        context.payBill(1500);

        // Switch to PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payBill(2500);

        // Switch to UPI
        context.setPaymentStrategy(new UpiPayment("user@upi"));
        context.payBill(500);
    }
}

