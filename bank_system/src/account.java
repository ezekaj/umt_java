public class account{
	public account() {
		this.balance = 0;
	}
	private double balance;	
	public boolean withdraw(double ammount){
		if (ammount > balance) {
			System.out.println("Not enough balance for the transaction!");
		}
		else if (ammount < 0 ) {
			System.out.println("Please insert a positive number for withdrawal");
		}
		else {
			balance -= ammount;
			System.out.println("Withdrawal succsesful!");
		}
		return false;
	}
	public boolean deposit(double ammount){
		if (ammount < 0) {
			System.out.println("Please insert correct ammount!");
		}
		else {
			balance += ammount;
			return true;
		}
		return false;
	}
	public double checkBalance(){
		return this.balance;
	}
	public static void main(String[] args) {
		account testaccount = new account();
		account elviaccount = new account();

		elviaccount.deposit(999);
		System.out.printf("test account %f\n", testaccount.checkBalance());
		System.out.printf("elvi account %f\n", elviaccount.checkBalance());
	}
}
