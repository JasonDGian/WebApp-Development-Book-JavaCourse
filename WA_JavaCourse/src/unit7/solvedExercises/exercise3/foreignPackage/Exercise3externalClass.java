package unit7.solvedExercises.exercise3.foreignPackage;

import unit7.solvedExercises.exercise3.CheckingAccount;

public class Exercise3externalClass {

	public static void main(String[] args) {
		
		// Empty constructor use.
		CheckingAccount accountChris = new CheckingAccount("CR192837", "Chris Redfield", 1000.50);
		
		
		System.out.println(accountChris.holderName);
		
		// These two induce errors due to lack of access (as expected).
//		System.out.println(accountChris.holderID);
//		System.out.println(accountChris.balance);

	}

}

