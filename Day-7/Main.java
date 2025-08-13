// BankAccount.java - Common base class
class BankAccount {
    int balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// SavingBankAccount.java
class SavingBankAccount extends BankAccount {
    // Inherits everything from BankAccount
}

// CurrentAccount.java
class CurrentAccount extends BankAccount {
    // Inherits everything from BankAccount
}

// BankService.java
class BankService {
    SavingBankAccount sb;
    CurrentAccount ca;

    public BankService() {
        sb = new SavingBankAccount();
        ca = new CurrentAccount();
    }

    public void depositToSaving(int amt) {
        sb.deposit(amt);
    }

    public void withdrawFromSaving(int amt) {
        sb.withdraw(amt);
    }

    public double getBalanceFromSaving() {
        return sb.getBalance();
    }

    public void depositToCurrent(int amt) {
        ca.deposit(amt);
    }

    public void withdrawFromCurrent(int amt) {
        ca.withdraw(amt);
    }

    public double getBalanceFromCurrent() {
        return ca.getBalance();
    }
}

// Main.java (or you can name the file BankApp.java)
public class Main {
    public static void main(String[] args) {
        BankService bs = new BankService();
        
        // Testing Saving Account
        bs.depositToSaving(10000);
        bs.withdrawFromSaving(1000);
        System.out.println("Saving Account Balance: " + bs.getBalanceFromSaving());

        // Testing Current Account
        bs.depositToCurrent(5000);
        bs.withdrawFromCurrent(2000);
        System.out.println("Current Account Balance: " + bs.getBalanceFromCurrent());
    }
}
