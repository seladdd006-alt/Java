class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Attempted to withdraw $" + amount +
                ", but balance is only $" + balance
            );
        }

        balance -= amount;

        System.out.println(
            "Successfully withdrew $" + amount +
            ". Remaining balance: $" + balance
        );
    }
}

public class BankDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100.0);

        try {
            System.out.println("Attempting to withdraw $150...");
            account.withdraw(150.0);

        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
