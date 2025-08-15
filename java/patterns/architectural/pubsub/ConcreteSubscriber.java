package com.pubsub;

class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String topic, String message) {
        System.out.println(name + " received on [" + topic + "]: " + message);
    }
}
