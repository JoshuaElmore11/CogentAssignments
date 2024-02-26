package Bank;

public class BankB extends Bank{
    double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    public void deposit(double a) {
        balance += a;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
