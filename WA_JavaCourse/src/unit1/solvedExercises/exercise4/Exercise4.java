package unit1.solvedExercises.exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Variables of current year and user YOB.
		int yearCurrent;
		int yearOfBirth;
		
		// Scanner object.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the current year.");
		
		yearCurrent = sc.nextInt();
		
		System.out.println("Enter the year you were born.");
		
		yearOfBirth = sc.nextInt();
		
		int age = yearCurrent-yearOfBirth;
		
		System.out.println("Presuming you already had your birthday this year, your age is " + age);
		
		sc.close(); // Scanner close.

	}

}
