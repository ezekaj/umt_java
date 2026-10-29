
public class Account {

    private double balance;
    private final String accountNumber;
    private String ownerName;

    public Account(String accNo, String name, double initb) {
        this.accountNumber = accNo;
        this.ownerName = name;
        this.balance = initb;
    }

    public String toString() {
        return this.accountNumber + " belongs to " + this.ownerName + " and it has a balance of " + this.balance;
    }
}
