package unit3.solvedExercises.exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declare variables.
		int age = 1;
		int studentsCount = 0;
		int adultStudents = 0;
		int ageSum = 0;
		double ageAverage = 0.00;

		// Until the user inputs a negative number the program will keep prompting for
		// data.
		do {
			System.out.println("-- Enter a negative number to abort. --");
			System.out.printf(
					"| Number of students: %02d | Number of adult students: %d| Average age: %.02f | Sum of all ages: %d |\n ",
					studentsCount, adultStudents, ageAverage, ageSum);
			System.out.println("Enter the student age: ");
			age = sc.nextInt();

			if (age > 0) {
				studentsCount++;
				ageSum = ageSum + age;
				ageAverage = (double) ageSum / studentsCount;

				if (age >= 18) {
					adultStudents++;
				}
			}

		} while (age >= 0);

		// Final report.
		System.out.println(" - - - FINAL REPORT - - - ");
		System.out.printf(
				"| Number of students: %02d | Number of adult students: %d| Average age: %.02f | Sum of all ages: %d |\n ",
				studentsCount, adultStudents, ageAverage, ageSum);
		
		sc.close();
	}

}
