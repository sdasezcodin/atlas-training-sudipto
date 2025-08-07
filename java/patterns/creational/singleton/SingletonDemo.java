package com.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // Correct way to access Singleton
        SingletonConfigManager configManager1 = SingletonConfigManager.getInstance();
        SingletonConfigManager configManager2 = SingletonConfigManager.getInstance();

        // Properties from the config (if present)
        String username = configManager1.getProperty("username");
        String timeout = configManager1.getProperty("timeout");
        String theme = configManager2.getProperty("theme");

        System.out.println("Username: " + username);
        System.out.println("Timeout: " + timeout);
        System.out.println("Theme: " + theme);

        // Check if same instance
        System.out.println("Both instances are same: " + (configManager1 == configManager2));
    }
}
