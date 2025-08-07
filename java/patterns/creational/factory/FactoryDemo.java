package com.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ConcretePizzaFactory factory = new ConcretePizzaFactory();

        AbstractPizzaProduct pizza1 = factory.createPizza("cheese");
        pizza1.bake();

        AbstractPizzaProduct pizza2 = factory.createPizza("pepperoni");
        pizza2.bake();
    }
}

