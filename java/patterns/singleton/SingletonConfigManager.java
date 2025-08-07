package com.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SingletonConfigManager {
    private static SingletonConfigManager instance;
    private Properties properties;

    // Private constructor to prevent instantiation
    private SingletonConfigManager() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input != null) {
                properties.load(input);
            } else {
                System.out.println("config.properties not found, using defaults");
                properties.setProperty("username", "admin");
                properties.setProperty("timeout", "30");
                properties.setProperty("theme", "dark");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Public method to access the singleton instance
    public static synchronized SingletonConfigManager getInstance() {
        if (instance == null) {
            instance = new SingletonConfigManager();
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}