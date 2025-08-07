package com.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        try {
            internet.connectTo("geeksforgeeks.org");
            internet.connectTo("tiktok.com");  // This should get blocked
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

