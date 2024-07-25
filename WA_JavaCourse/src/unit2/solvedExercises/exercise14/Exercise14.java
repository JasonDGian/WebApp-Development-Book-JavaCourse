package unit2.solvedExercises.exercise14;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("- - - Enter a date - - -");
		System.out.println("Enter the day:");
		int day = sc.nextInt();
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		System.out.println("Enter the year:");
		int year = sc.nextInt();

		int monthDays = 0;

		/*
		 * check the month, to see how many days there are in it. if the day surpasses
		 * the number of days in the entered month then reset it (via subtraction) and
		 * add 1 to month. if the month is 12 and surpassed then reset it to 1 and add 1
		 * to year.
		 */

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

		// increment day.
		day++;

		// If the day surpasses the chosen month's day count.
		if (day > monthDays) {
			day = day - monthDays;
			month++;
		}

		if (month > 12) {
			month = month - 12;
			year++;
		}

		System.out.printf("The resulting date after a day is: %02d-%02d-%04d", day, month, year);
		
		sc.close();
	}

}
