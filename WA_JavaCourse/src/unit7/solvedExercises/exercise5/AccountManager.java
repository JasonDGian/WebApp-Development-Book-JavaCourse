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
class AccountManager {

	// Final attribute, once assigned never changes.
	private final String contactNumber;

	// Attributes
	private String name;
	private double authorizedAmount = 10000.00;

	public AccountManager(String name, String number) {
		this.name = name;
		this.contactNumber = number;
	}

	public AccountManager(String name, String number, double amount) {
		this(name, number);
		this.authorizedAmount = amount;
	}

	// Access methods.

	// The name will be public to everyone.
	public String getName() {
		return name;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	// Authorize quantity is only visible to neighbouring classes.
	double getAuthorizedAmount() {
		return authorizedAmount;
	}
	
	// Accessible only to neighbouring classes.
	void getInfo() {
		System.out.printf("Manager name: %s\n" , this.getName());
		System.out.printf("Manager contact number: %s\n" , this.getContactNumber());
		System.out.printf("Manager authorized amount: %s\n" , this.getAuthorizedAmount());
	}

	void setAuthorizedAmount(double authorizedAmount) {
		this.authorizedAmount = authorizedAmount;
	}

}
