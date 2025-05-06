package assign1.code33;



/*
Design a BankAccount class with methods for deposit, withdraw, transfer, and account
balance check.
 */
class BankAccount {
    private String name;
    private double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance = " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance = " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        if (amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred " + amount + " to " + receiver.name);
        } else {
            System.out.println("Transfer failed: Insufficient funds.");
        }
    }

    public void checkBalance() {
        System.out.println("Account: " + name + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Aniket", 1000);
        BankAccount a2 = new BankAccount("Ravi", 500);

        a1.deposit(200);
        a1.withdraw(150);
        a1.transfer(a2, 300);
        a1.checkBalance();
        a2.checkBalance();
    }

}