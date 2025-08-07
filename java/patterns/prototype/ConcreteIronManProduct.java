package com.prototype;

public class ConcreteIronManProduct implements AbstractSuperHeroProduct {
    @Override
    public ConcreteIronManProduct clone() {
        return new ConcreteIronManProduct();
    }

    @Override
    public String getInfo() {
        return "IronMan - Genius Billionaire";
    }
}
