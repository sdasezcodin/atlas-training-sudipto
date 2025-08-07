package com.decorator;

public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}

