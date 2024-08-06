package unit7.solvedExercises.exercise1;

/*
 * Design the class CheckingAccount that stores the data dni, holderName, and the balance. 
 * The typical operations with a current account are:
 *
 * Create a current account: The DNI and the holder's name are required. The initial balance is 0.
 * Withdraw money: The method should indicate if the operation was possible if there is sufficient balance.
 * Deposit money: The balance is increased.
 * Show information: Displays the available information of the current account.
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		CheckingAccount bankAccount = new CheckingAccount();
		
		bankAccount.setHolderName("James Sunderland");
		bankAccount.setHolderID("616656376");
		
		// operations.
		bankAccount.deposit(10000.0);
		bankAccount.withdraw(200.50);
		
		bankAccount.showAccountInfo();

	}

}
