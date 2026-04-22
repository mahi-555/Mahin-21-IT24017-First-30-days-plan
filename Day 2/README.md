Example 01

<pre>
public class Main {
  `  public static void main ( string[] args){
    person person = new person("Alic",30);
    system.out.println("Name: "+ person.getName());
    system.out.println("Age: " + person.getAge());
    person.setName("Bob");
    person.setAge(25);
    system.out.println("Update Name: "+ person.getName());
    system.out.println("Update Age: " + person.getAge());
    person.setAge(-5);
  }
}



 class person {
  private string name;
  private int age;
  public person(string name, int age) {
    this.name = name;
    this.age = age;
    public string getName() {
      return name;
    }
    public void setName(string name) {
      this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age){
    if(age>=0) {
      this.age = age;
    } else{
      system.out.println("Age cannot be negative.");
    }
  }
}




Example 02


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


class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

        </prev>
