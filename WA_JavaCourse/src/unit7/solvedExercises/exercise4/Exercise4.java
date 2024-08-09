package unit7.solvedExercises.exercise4;


/**
 * All current accounts to be worked with belong to the same bank.
 * Add an attribute that stores the name of the bank, which is unique in the current account class.
 * Design a method that allows retrieving and modifying the name of the bank, 
 * to which all current accounts belong.
 */

public class Exercise4 {

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
		
		
		// Accessing the method through the class itself.
		System.out.println(	CheckingAccount.getBankName() );

		// Accessing it through the instance (should not be done afaik).
		//System.out.println(	accountJames.getBankName() );

		/* 
		 * NOTE: The instance access to static methog while syntactically allowed in 
		 * Java, is not considered best practice. 
		 * Static methods and attributes should be accessed through the class name. 
		 */
		
		
		// Accessing the method through the class itself.
		CheckingAccount.setBankName( "Tricell Bank" );
		
		System.out.println(	CheckingAccount.getBankName() );
		
	}

}
