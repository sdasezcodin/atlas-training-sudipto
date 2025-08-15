package com.pubsub;
import java.util.*;

class EventBus {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(String topic, Subscriber subscriber) {
        subscribers.computeIfAbsent(topic, k -> new ArrayList<>()).add(subscriber);
    }

    public void unsubscribe(String topic, Subscriber subscriber) {
        subscribers.getOrDefault(topic, new ArrayList<>()).remove(subscriber);
    }

    public void publish(String topic, String message) {
        List<Subscriber> subs = subscribers.getOrDefault(topic, Collections.emptyList());
        for (Subscriber s : subs) {
            s.update(topic, message);
        }
    }
}
