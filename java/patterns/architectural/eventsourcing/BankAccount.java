package com.eventsourcing;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private double balance;
    private final List<Event> eventStore = new ArrayList<>();

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    // Record and apply events
    public void deposit(double amount) {
        recordEvent(new DepositEvent(amount));
    }

    public void withdraw(double amount) {
        recordEvent(new WithdrawEvent(amount));
    }

    private void recordEvent(Event event) {
        eventStore.add(event);
        event.apply(this);
    }

    // Rebuild state from events
    public void replayEvents() {
        balance = 0; // reset state
        for (Event e : eventStore) {
            e.apply(this);
        }
    }

    public List<Event> getEventStore() {
        return eventStore;
    }
}
