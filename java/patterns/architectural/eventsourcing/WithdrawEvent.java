package com.eventsourcing;

class WithdrawEvent implements Event {
    private final double amount;
    public WithdrawEvent(double amount) { this.amount = amount; }

    @Override
    public void apply(BankAccount account) {
        account.setBalance(account.getBalance() - amount);
    }

    @Override
    public String toString() {
        return "Withdrew: " + amount;
    }
}

