package unit1.solvedExercises.exercise14;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to round;");
		double num = sc.nextDouble();
		
		// adds 0.5 to the given number.
		num = num + 0.5;
		
		// truncates the obtained number and stores in a new variable of int type.
		int roundedNum = (int)num;
		
		System.out.println(roundedNum);
		
		sc.close();

	}

}
