
package Week3.practice;

public class BankAccount {

    private String holderName;
    private float balance;

    // Constructor
    public BankAccount(String holderName, float balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    // Get holder name
    public String getHolderName() {
        return holderName;
    }

    // Get balance
    public float getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(float amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("You don't have enough money.");
        }
    }

    // Transfer money to another account
    public void transfer(BankAccount receiver, float amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount!");
        } else if (balance >= amount) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display account information
    public void displayBalance() {
        System.out.println("Holder's name: " + holderName);
        System.out.println("Bank account balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Nihat", 500);
        BankAccount account2 = new BankAccount("Ali", 200);

        // Deposit
        account1.deposit(300);

        // Withdraw
        account1.withdraw(20);

        // Transfer 100 from Nihat to Ali
        account1.transfer(account2, 100);

        // Display both accounts
        account1.displayBalance();
        account2.displayBalance();
    }
}

