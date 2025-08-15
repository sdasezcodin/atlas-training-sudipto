package com.eventsourcing;

public class EventSourcingDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // User actions
        account.deposit(100);
        account.withdraw(30);
        account.deposit(50);

        // Check balance
        System.out.println("Current Balance: " + account.getBalance());

        // Event history
        System.out.println("Event Store: " + account.getEventStore());

        // Simulate system crash + recovery
        BankAccount restoredAccount = new BankAccount();
        restoredAccount.getEventStore().addAll(account.getEventStore());
        restoredAccount.replayEvents();

        System.out.println("Restored Balance after replay: " + restoredAccount.getBalance());
    }
}
