package unit7.solvedExercises.exercise5;

import java.util.Objects;

/**
 * There are managers who administer bank accounts and attend to their owners.
 * Each account, if it has one, has a unique manager.
 * 
 * Design the manager class which includes their name, phone number, and the
 * maximum authorized amount they can operate with.
 * 
 * Regarding the managers, the following restrictions exist: - A manager will
 * always have a name and phone number. - If not assigned, the maximum
 * authorized amount is €10,000. - A manager, once assigned, cannot change their
 * phone number. Everyone will be able to consult it. - The name will be public
 * and the maximum authorized amount will only be visible to neighboring
 * classes.
 * 
 * Modify the current account class so that it can have a manager and write the
 * necessary methods.
 */

public class CheckingAccount {

	// Static attributes.
	private static String bankName = "Konami INC Bank";

	// Attributes
	private double balance = 0.00;
	public String holderName;
	String holderID;
	private AccountManager manager=null;

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

	public CheckingAccount(String holderID, String holderName, double balance, AccountManager manager) {
		this(holderID, holderName, balance);
		this.manager = manager;
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
	
	public void getManagerInfo() {
		manager.getInfo();
	}
	
	public void setManager( AccountManager manager) {
		this.manager = manager;
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
		
		if ( manager != null ) {
			System.out.println("This account is managed by:");
			getManagerInfo();
		}
		
		else {
			System.out.println("This account is not managed.");
		}
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