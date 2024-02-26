package Bank;

public class Main {
    public static void main(String[] args) {
        BankA bankA = new BankA(100);
        BankB bankB = new BankB(150);
        BankC bankC = new BankC(200);

        System.out.println("Bank A current balance is: " + bankA.getBalance());
        System.out.println("Bank B current balance is: " + bankB.getBalance());
        System.out.println("Bank C current balance is: " + bankC.getBalance());
    }
}
