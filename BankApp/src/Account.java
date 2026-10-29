
public class Account {

    private double balance;
    private final String accountNumber;
    private String ownerName;

    public Account(String accNo, String name, double initb) {

        if (initb < 0) {
            throw new IllegalArgumentException("Init balance cannot be negative!");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
        if (accNo == null || accNo.isBlank()) {
            throw new IllegalArgumentException("Account Number cannot be empty!");
        }
        this.accountNumber = accNo;
        this.ownerName = name;
        this.balance = initb;
    }

    public String getaccNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String coolName) {
        this.ownerName = coolName;
    }

    public void deposit(double ammount) {
        if (ammount < 0) {
            throw new IllegalArgumentException("Deposit ammount cannot be negative!");
        }
        this.balance += ammount;
    }

    public boolean withdraw(double ammount) {
        if ((this.balance < ammount) || (ammount < 0)) {
            throw new IllegalArgumentException("The ammount you want to withdraw its not correct!");
        }
        this.balance -= ammount;
        return true;
    }

    public String toString() {
        return this.accountNumber + " belongs to " + this.ownerName + " and it has a balance of " + this.balance;
    }
}
