package unit2.solvedExercises.exercise12;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("- - - Enter a date - - -");
		System.out.println("Enter the day of the month:");
		int day = sc.nextInt();
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		System.out.println("Enter the year:");
		int year = sc.nextInt();

		int monthDays = 0;

		// year 0 doesn't exist.
		if (year == 0) {
			System.out.println("Invalid year entered.");
		} else {

			if (month <= 12 && month >= 1) {

				switch (month) {

				case 1, 3, 5, 7, 8, 10, 12:
					monthDays = 31;
					break;

				case 4, 6, 9, 11:
					monthDays = 30;
					break;

				case 2:
					monthDays = 28;
					break;

				default:
					break;
				}

				if (day > monthDays || day < 1) {
					System.out.println("ERROR: Invalid day of month entered.");
				}

				else {

					System.out.printf(" The entered date is %d / %d / %d ", day, month, year);

				}

			}

			else {
				System.out.println("ERROR: Invalid month entered.");
			}

		}
		sc.close();

	}

}
