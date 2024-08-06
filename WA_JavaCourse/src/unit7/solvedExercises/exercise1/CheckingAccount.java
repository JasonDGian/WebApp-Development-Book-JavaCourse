package unit7.solvedExercises.exercise1;

import java.util.Objects;

class CheckingAccount {

	// Attributes
	private String holderID;
	private String holderName;
	private double balance = 0.00;

	// CONSTRUCTORS
	public CheckingAccount() {

	}

	public CheckingAccount(String holderID, String holderName) {
		this.holderID = holderID;
		this.holderName = holderName;
	}

	// ACCESS METHODS.
	public String getHolderID() {
		return holderID;
	}

	public void setHolderID(String holderID) {
		this.holderID = holderID;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(balance, holderID, holderName);
	}

	// FUNCTIONAL METHODS.
	public void withdraw(double amount) {

		if (this.getBalance() >= amount) {

			this.balance = (this.balance - amount);
			System.out.printf("The amount %.02f has been withdrawn. " + "Current balance: %.02f \n", amount,
					this.getBalance());
		} else {
			System.out.println("The amount surpasses the funds. Cannot withdraw.");
		}

	}

	public void deposit(double amount) {

		this.balance = (this.getBalance() + amount);
		System.out.printf("The previous amount available was %.02f\n", (this.balance - amount));
		System.out.printf("The new amount available is %.02f\n", this.balance);
	}

	public void showAccountInfo() {
		System.out.println("------- ACCOUNT INFO -------------------------------");
		System.out.println("Holder ID: " + this.getHolderID());
		System.out.println("Holder name: " + this.getHolderName());
		System.out.println("Account balance: " + this.getBalance());
	}

	// COMPARISON METHODS.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckingAccount other = (CheckingAccount) obj;
		return Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
				&& Objects.equals(holderID, other.holderID) && Objects.equals(holderName, other.holderName);
	}

	// GENERIC TOSTRING.
	@Override
	public String toString() {
		return "CheckingAccount [holderID=" + holderID + ", holderName=" + holderName + ", balance=" + balance + "]";
	}

}