package com.eventsourcing;

interface Event {
    void apply(BankAccount account);
}
