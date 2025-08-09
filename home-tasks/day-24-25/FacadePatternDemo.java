class FdService {
    public void getFdServiceDetails(String accountNo) {
        System.out.println("Fetching FD service details for account: " + accountNo);
    }
}

class LoanService {
    public void getLoanDetails(String accountNo) {
        System.out.println("Fetching Loan details for account: " + accountNo);
    }
}

class AccountService {
    public void getAccountDetails(String accountNo) {
        System.out.println("Fetching Account details for account: " + accountNo);
    }
}

class BankFacade {
    private FdService fdService;
    private LoanService loanService;
    private AccountService accountService;

    public BankFacade() {
        this.fdService = new FdService();
        this.loanService = new LoanService();
        this.accountService = new AccountService();
    }

    public void getFdDetails(String accountNo) {
        fdService.getFdServiceDetails(accountNo);
    }

    public void getLoanDetails(String accountNo) {
        loanService.getLoanDetails(accountNo);
    }

    public void getAccountDetails(String accountNo) {
        accountService.getAccountDetails(accountNo);
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();

        bankFacade.getAccountDetails("ACC123");
        bankFacade.getFdDetails("ACC123");
        bankFacade.getLoanDetails("ACC123");
    }
}






















