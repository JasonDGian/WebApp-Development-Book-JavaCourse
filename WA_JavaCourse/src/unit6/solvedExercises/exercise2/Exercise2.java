package unit6.solvedExercises.exercise2;

/*
 * Enter two phrases using the keyboard and indicate which sentence is the longest.
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string.");
		String string1 = sc.nextLine();
		
		System.out.println("Enter another string.");
		String string2 = sc.nextLine();

		if ( string1.length() > string2.length() ) {
			System.out.println("The first sentence is longer than the second one.");
		}
		else if ( string1.length() < string2.length() ) {
			System.out.println("The first sentence is shorter than the second one.");
		}
		else {
			System.out.println("Both sentences are the same length.");
		}
		
		sc.close();
	}

}
