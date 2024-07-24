package unit2.solvedExercises.exercise11;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number between 1 and 7:");
		int grade = sc.nextInt();

		switch (grade) {

		case 1: 
			System.out.println("Monday");
			break;
		

		case 2: 
			System.out.println("Tuesday");
			break;
		

		case 3:
			System.out.println("Wednesday");
			break;
		

		case 4: 
			System.out.println("Thursday");
			break;
		

		case 5: 
			System.out.println("Friday");
			break;
		

		case 6: 
			System.out.println("Saturday");
			break;
		

		case 7: 
			System.out.println("Sunday.");
			break;
		
		default: System.out.println("Unexpected number.");

		}

		sc.close();

	}

}
