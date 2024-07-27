package unit4.solvedExercises.exercise5;

import java.util.Scanner;

// Create a function that uses a boolean to indicate 
// whether the character passed as an input parameter is a vowel.

public class Exercise5 {

	public static char getChar(String line) {

		return line.charAt(0);

	}

	public static boolean isVowel(char ch) {

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character to check if is vowel or not.");
		String line = sc.nextLine();

		System.out.println(isVowel(getChar(line)));
		
		sc.close();

	}

}
