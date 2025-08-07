package com.proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements Internet {
    private Internet realInternet = new RealInternet();
    private static final List<String> bannedSites = Arrays.asList("facebook.com", "instagram.com", "tiktok.com");

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied to " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }
}

