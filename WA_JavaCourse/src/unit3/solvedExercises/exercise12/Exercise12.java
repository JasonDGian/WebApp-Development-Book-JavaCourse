package unit3.solvedExercises.exercise12;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Start supposing no one failed.
		boolean hasFailed = false;
		int grade;

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter student grade to check.");
			grade = sc.nextInt();

			if (grade < 5) {
				hasFailed = true;
			}

		}

		if (hasFailed) {
			System.out.println("Student with insufficient grade found.");
		} else {
			System.out.println("No failed student was entered.");
		}
		
		sc.close();

	}

}
