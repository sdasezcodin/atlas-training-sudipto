package com.pubsub;

interface Subscriber {
    void update(String topic, String message);
}
