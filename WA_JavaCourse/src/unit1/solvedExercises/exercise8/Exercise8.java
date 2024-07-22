package unit1.solvedExercises.exercise8;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
	// Ask the user for age and calculate if 18+ or not.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		int age = sc.nextInt();
		
		// Method 1 
		System.out.println("The user is 18 or older: " + (age>=18));
		
		// Method 2
		boolean isOfAge = age>=18;
		System.out.println("The user is 18 or older: " + isOfAge);
		
		sc.close();

	}

}
