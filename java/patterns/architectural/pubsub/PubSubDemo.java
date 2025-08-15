package com.pubsub;

public class PubSubDemo {
    public static void main(String[] args) {
        EventBus bus = new EventBus();

        Subscriber s1 = new ConcreteSubscriber("Alice");
        Subscriber s2 = new ConcreteSubscriber("Bob");

        bus.subscribe("sports", s1);
        bus.subscribe("news", s1);
        bus.subscribe("sports", s2);

        bus.publish("sports", "Team A won the match!");
        bus.publish("news", "Weather update: Sunny day ahead.");
        bus.publish("sports", "Player X scored a hat-trick!");
    }
}
