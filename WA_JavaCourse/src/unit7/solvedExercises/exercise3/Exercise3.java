package unit7.solvedExercises.exercise3;

/*
 * Modify the visibility of the CheckingAccount class so that it is visible from external classes, and the visibility of its attributes so that:
 * 
 * balance: is not visible to other classes.
 * name: is public for any class.
 * ID: is only visible to neighboring classes.
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
