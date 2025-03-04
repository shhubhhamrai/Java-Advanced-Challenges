// Exercise -01 : Creating a BankAccount class which initializes new account with initial balance...

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        if (initialBalance >= 0) {
            this.balance = initialBalance;
            System.out.println("Created the Bank Account with Initial Balance : "+initialBalance);
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting to $0.");
            this.balance = 0;
        }
    }
    public BankAccount(){
        this(0);
    }

public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500);
        BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();
    }
}