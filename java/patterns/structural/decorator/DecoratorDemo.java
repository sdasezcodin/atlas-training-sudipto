package com.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        // Base coffee
        Beverage myCoffee = new Coffee();
        System.out.println("Order Plain Coffee: " + myCoffee.getDescription());
        System.out.println("Total: ₹" + myCoffee.getCost());

        // Add milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println("Order Coffee with Milk: " + myCoffee.getDescription());
        System.out.println("Total: ₹" + myCoffee.getCost());

        // Add sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println("Order Coffee with Milk and Sugar: " + myCoffee.getDescription());
        System.out.println("Total: ₹" + myCoffee.getCost());
    }
}

