package unit7.solvedExercises.exercise5;

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
public class Exercise5 {

	public static void main(String[] args) {

		// Fully constructed.
		CheckingAccount accountHayter = new CheckingAccount("DH192837", "David Hayter", 99123.20 );
			
		AccountManager managerOcelot = new AccountManager("Revolver 'Shalashaska' Ocelot" , "555-561693" , 1500.00 );
		
		// Sets Ocelot as David's manager.
		accountHayter.setManager(managerOcelot);
		
		// test for manager.
		System.out.println( managerOcelot.getAuthorizedAmount() );
		
		// Change authorize amount.
		managerOcelot.setAuthorizedAmount(2500.00);
		
		// No need to print.
		managerOcelot.getInfo();
		
		System.out.println(	managerOcelot.getName() );
		

		
		
	
	}

}
