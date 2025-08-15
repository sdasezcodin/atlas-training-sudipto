package com.eventsourcing;

class DepositEvent implements Event {
    private final double amount;
    public DepositEvent(double amount) { this.amount = amount; }

    @Override
    public void apply(BankAccount account) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public String toString() {
        return "Deposited: " + amount;
    }
}
