package com.prototype;
import java.util.Map;
import java.util.HashMap;


public class SuperHeroCloneCache {
    private static final Map<String, AbstractSuperHeroProduct> cache = new HashMap<>();

    public static void loadCache() {
        cache.put("batman", new ConcreteBatManProduct());
        cache.put("ironman", new ConcreteIronManProduct());
        cache.put("spiderman", new ConcreteSpiderManProduct());
    }

    public static AbstractSuperHeroProduct getClone(String key) {
        AbstractSuperHeroProduct prototype = cache.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}

