package unit7.solvedExercises.exercise4;

import java.util.Objects;

/**
 * All current accounts to be worked with belong to the same bank. Add an
 * attribute that stores the name of the bank, which is unique in the current
 * account class. Design a method that allows retrieving and modifying the name
 * of the bank, to which all current accounts belong.
 */

public class CheckingAccount {

	// Static attributes.
	private static String bankName = "Mishima Zaibatsu Bank";

	// Attributes
	private double balance = 0.00;
	public String holderName;
	String holderID;

	// CONSTRUCTORS
	public CheckingAccount() {

	}

	public CheckingAccount(String holderID, double balance) {
		this.holderID = holderID;
		this.balance = balance;
	}

	public CheckingAccount(String holderID, String holderName, double balance) {
		this(holderID, balance);
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

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String newName) {
		bankName = newName;

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