package Bank;

public class BankC extends Bank{
    double balance;

    public BankC(double balance) {
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
