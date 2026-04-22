
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("John Doe", 500.00);
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Current Balance: $" + myAccount.getBalance());

        myAccount.deposit(150.0);
        myAccount.withdraw(100.0);
        myAccount.withdraw(1000.0);
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
