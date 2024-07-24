package unit2.solvedExercises.exercise10;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a grade for evaluation:");
		int grade = sc.nextInt();
		
		switch(grade) {
			
		case 0,1,2,3 -> {
			System.out.println("Fail.");
			break;
		}
		
		case 4 -> {
			System.out.println("Poor - D");
			break;
		}
		
		case 5, 6 -> {
			System.out.println("Satisfactor - C");
			break;
		}
		
		case 7, 8 -> {
			System.out.println("Bood. - B");
			break;
		}
		
		case 9, 10 -> {
			System.out.println("Excellent - A.");
			break;
		}
		
		}

		sc.close();

	}

}
