package unit7.solvedExercises.exercise3;

/*
 * In the CheckingAccount class, overload the constructors to be able to create objects:
 * 
 * With the account holder's DNI and an initial balance.
 * With the DNI, name, and initial balance.
 * Write a program that verifies the functionality of the methods.
 */

public class Exercise3 {

	public static void main(String[] args) {

		// Empty constructor use.
		CheckingAccount accountJames = new CheckingAccount();

		accountJames.setHolderName("James Sunderland");
		accountJames.setHolderID("616656376");

		// Constructor with ID and balance.
		CheckingAccount accountHeather = new CheckingAccount("HM576913", 162437.00);

		// Fully constructed.
		CheckingAccount accountLisa = new CheckingAccount("LG192837", "Lisa Garland", 99123.20);

		accountJames.showAccountInfo();
		
		System.out.println();
		
		accountHeather.showAccountInfo();
		
		System.out.println();
		
		accountLisa.showAccountInfo();
	}

}
