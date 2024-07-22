package unit1.solvedExercises.exercise12;

import java.util.Scanner;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for it's absolute value: ");
		double number = sc.nextDouble();
		
		
		// Method 1
		number = Math.abs(number);
		
		System.out.printf("The absolute value of the number is %f" , number);
		
		
		// Method 2
		
		double absoluteNumber;

		if (number<0) {
			absoluteNumber = number*-1;
		}

		else { absoluteNumber = number; }
		
		System.out.printf("\nThe absolute value of the number is %f" , absoluteNumber);
	
		
		sc.close();
	}

}
