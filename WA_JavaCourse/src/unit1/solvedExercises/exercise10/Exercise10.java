package unit1.solvedExercises.exercise10;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Have you finished your homework? (true/false)");
		boolean homeworkIsDone = sc.nextBoolean();

		System.out.println("Is it raining outside? (true/false)");
		boolean isRaining = sc.nextBoolean();

		System.out.println("Do you need to go to the library? (true/false)");
		boolean mustGoLibrary = sc.nextBoolean();

		// If homework is done and is not raining OR must go to the library.
		if (homeworkIsDone && !isRaining || mustGoLibrary) {
			System.out.println("You can go out!");
		}

		else {
			System.out.println("You can not go out.");
		}
		
		sc.close();

	}

}
