package com.factory;

public class ConcretePizzaFactory {
    public AbstractPizzaProduct createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new ConcreteCheezyPizzaProduct();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new ConcretePepperoniPizzaProduct();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}

