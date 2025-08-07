package com.prototype;

public class ConcreteSpiderManProduct implements AbstractSuperHeroProduct {
    @Override
    public ConcreteSpiderManProduct clone() {
        return new ConcreteSpiderManProduct();
    }

    @Override
    public String getInfo() {
        return "SpiderMan - Friendly Neighborhood";
    }
}
