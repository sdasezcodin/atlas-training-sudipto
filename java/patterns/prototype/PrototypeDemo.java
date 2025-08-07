package com.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        SuperHeroCloneCache.loadCache();

        AbstractSuperHeroProduct batman = SuperHeroCloneCache.getClone("batman");
        System.out.println("Cloned: " + batman.getInfo());

        AbstractSuperHeroProduct ironman = SuperHeroCloneCache.getClone("ironman");
        System.out.println("Cloned: " + ironman.getInfo());

        AbstractSuperHeroProduct spiderman = SuperHeroCloneCache.getClone("spiderman");
        System.out.println("Cloned: " + spiderman.getInfo());
    }
}
