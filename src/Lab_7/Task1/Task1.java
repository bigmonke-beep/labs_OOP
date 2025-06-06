package Lab_7.Task1;

public class Task1 {
    private String accountNumber;
    private double balance;

    public Task1(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Баланс не може бути від'ємним.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостатньо коштів.");
        }
    }

    public static void main(String[] args) {
        Task1 account = new Task1("357", 1408.0);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Поточний баланс: " + account.getBalance());
    }
}

