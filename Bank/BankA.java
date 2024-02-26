package Bank;

public class BankA extends Bank{
    double balance;

    public BankA(double balance) {
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
