package com.prototype;

public class ConcreteBatManProduct implements AbstractSuperHeroProduct {
    @Override
    public ConcreteBatManProduct clone() {
        return new ConcreteBatManProduct();
    }

    @Override
    public String getInfo() {
        return "BatMan - The Dark Knight";
    }
}
