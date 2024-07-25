package unit2.solvedExercises.exercise13;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("- - - Enter a time - - -");
		System.out.println("Enter the hour:");
		int hour = sc.nextInt();
		System.out.println("Enter the minute:");
		int min = sc.nextInt();
		System.out.println("Enter the second:");
		int sec = sc.nextInt();

		// add a second.
		sec = sec + 1;

		// If the seconds reach 59 or more, subtract 60 (rather than manually
		// zeroing) then add 1 to minutes.
		if (sec > 59) {
			sec = sec - 60;
			min = min + 1;
		}

		// If the minutes reach 59 or more subtract 60 (rather than manually
		// zeroing) then add 1 to hours.
		if (min > 59) {
			min = min - 60;
			hour = hour + 1;
		}

		if (hour > 11) {
			hour = hour - 12;
		}

		System.out.println("The time after a second will be: ");

		System.out.printf("%02d : %02d : %02d", hour, min, sec);
	}

}
