import java.util.ArrayList;
import java.util.List;

// ===================== Interfaces =====================
interface Payment {
    Object status();
    List<Object> getListOfPayment();
}

interface Bank {
    void initiatePayment();
    void stopPayment();
}

interface Loan {
    void initiateRepayment();
    void initiateFinalSettlement();
}

// ===================== BankPayment Class =====================
class BankPayment implements Payment, Bank {
    private List<Object> payments = new ArrayList<>();

    @Override
    public void initiatePayment() {
        System.out.println("Bank payment initiated.");
        payments.add("Payment Started");
    }

    @Override
    public void stopPayment() {
        System.out.println("Bank payment stopped.");
        payments.add("Payment Stopped");
    }

    @Override
    public Object status() {
        return payments.isEmpty() ? "No Payment" : payments.get(payments.size() - 1);
    }

    @Override
    public List<Object> getListOfPayment() {
        return payments;
    }
}

// ===================== LoanPayment Class =====================
class LoanPayment implements Payment, Loan {
    private List<Object> loanTransactions = new ArrayList<>();

    @Override
    public void initiateRepayment() {
        System.out.println("Loan repayment initiated.");
        loanTransactions.add("Repayment Started");
    }

    @Override
    public void initiateFinalSettlement() {
        System.out.println("Loan final settlement done.");
        loanTransactions.add("Final Settlement Completed");
    }

    @Override
    public Object status() {
        return loanTransactions.isEmpty() ? "No Transactions" : loanTransactions.get(loanTransactions.size() - 1);
    }

    @Override
    public List<Object> getListOfPayment() {
        return loanTransactions;
    }
}

// ===================== Main Class =====================
public class InterfaceSegregationDemo {
    public static void main(String[] args) {
        // Working with BankPayment
        BankPayment bankPayment = new BankPayment();
        bankPayment.initiatePayment();
        bankPayment.stopPayment();
        System.out.println("Bank Status: " + bankPayment.status());
        System.out.println("Bank Payments: " + bankPayment.getListOfPayment());

        // Working with LoanPayment
        LoanPayment loanPayment = new LoanPayment();
        loanPayment.initiateRepayment();
        loanPayment.initiateFinalSettlement();
        System.out.println("Loan Status: " + loanPayment.status());
        System.out.println("Loan Payments: " + loanPayment.getListOfPayment());
    }
}
