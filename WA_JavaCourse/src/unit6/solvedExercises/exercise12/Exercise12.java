package unit6.solvedExercises.exercise12;

import java.util.Scanner;

// Write a program that asks the user for two words and 
// indicates if they are anagrams of each other.

public class Exercise12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two words to check (separate with a space):");
		String enteredSentence = sc.nextLine();
		
		String[] enteredWords = enteredSentence.split(" ");
		
		for ( int word = 0; word < enteredWords.length ; word++ ) {
			
			for ( int j = 0 ; j < enteredWords[word].length() ; j++  ) {
				
				
				
			}
			
		}
		

		sc.close();
	}

}
