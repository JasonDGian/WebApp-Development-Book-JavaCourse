package unit1.solvedExercises.exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {


		// Scanner object.
		Scanner sc = new Scanner(System.in);
		
		// User prompt.
		System.out.println("Enter your current age.");
		
		// Number integer variable.
		int age = sc.nextInt();
		
		// Return the user their current age +1.
		System.out.println("Next year you will be " + (age+1) + " years old.");
		
		sc.close(); // close scanner.


	}

}
