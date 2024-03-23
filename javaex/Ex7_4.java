import java.util.Scanner;

// Custom exception for balance-related errors
class BalanceException extends Exception {
    public BalanceException(String message) {
        super(message);
    }
}

// Custom exception for withdrawal-related errors
class WithdrawException extends Exception {
    public WithdrawException(String message) {
        super(message);
    }
}

// Custom exception for PIN-related errors
class PinException extends Exception {
    public PinException(String message) {
        super(message);
    }
}

// Interface for ATM operations
interface ATMOperations {
    void balanceEnquiry() throws BalanceException;

    void withdraw(double amount) throws WithdrawException;

    void changePin(int newPin) throws PinException;
}

// Implementation of ATMOperations interface
class ATM implements ATMOperations {
    private double balance;
    private int pinAttempts;

    // Constructor
    public ATM(double initialBalance) throws BalanceException {
        if (initialBalance < 500) {
            throw new BalanceException("Initial balance must be at least 500.");
        }
        this.balance = initialBalance;
        this.pinAttempts = 0;
    }

    // Method to handle balance exception
    private void checkBalance(double amount) throws BalanceException {
        if (balance < amount) {
            throw new BalanceException("Insufficient balance.");
        }
    }

    // Method to handle withdrawal exception
    private void checkWithdrawal(double amount) throws WithdrawException {
        if (balance < amount) {
            throw new WithdrawException("Withdrawal amount exceeds available balance.");
        }
    }

    // Method to handle PIN exception
    private void checkPinAttempts() throws PinException {
        if (pinAttempts >= 3) {
            throw new PinException("Too many incorrect PIN attempts. Card blocked.");
        }
    }

    // Interface method - Balance Enquiry
    @Override
    public void balanceEnquiry() throws BalanceException {
        System.out.println("Balance Enquiry");
        System.out.println("Balance: $" + balance);
    }

    // Interface method - Withdraw
    @Override
    public void withdraw(double amount) throws WithdrawException {
        try {
            checkBalance(amount);
        } catch (BalanceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        checkWithdrawal(amount);

        // Process withdrawal
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
    }

    // Interface method - Change PIN
    @Override
    public void changePin(int newPin) throws PinException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current PIN: ");
        int currentPin = scanner.nextInt();

        if (currentPin != 1234) { // Replace 1234 with your initial PIN
            pinAttempts++;
            throw new PinException("Incorrect current PIN. PIN change failed.");
        }

        System.out.print("Enter new PIN: ");
        int confirmNewPin = scanner.nextInt();

        if (newPin != confirmNewPin) {
            throw new PinException("New PINs do not match. PIN change failed.");
        }

        System.out.println("PIN changed successfully.");
    }
}

public class Ex7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter initial balance: $");
            double initialBalance = scanner.nextDouble();

            // Create ATM object
            ATM atm = new ATM(initialBalance);

            // Perform ATM operations
            atm.balanceEnquiry();

            // Example withdrawal
            try {
                atm.withdraw(600); // This will throw WithdrawException due to insufficient balance
            } catch (WithdrawException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Example PIN change
            try {
                atm.changePin(5678); // This will throw PinException due to incorrect current PIN
            } catch (PinException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (BalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
