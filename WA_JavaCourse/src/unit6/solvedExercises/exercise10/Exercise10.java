package unit6.solvedExercises.exercise10;

import java.util.Scanner;

/* 
 * Write a program that reads a sentence from the keyboard and 
 * tells us if it is a palindrome, ignoring spaces. Accented 
 * vowels can cause algorithms to consider a palindrome sentence 
 * as if it were not, so we will assume that the user inputs a 
 * sentence without accents.
 */

// Tests
// A man a plan a canal Panama
// Madam In Eden I’m Adam
// No lemon no melon
public class Exercise10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sentence;
		String sentenceC1 = "";
		String sentenceC2 = "";

		System.out.println("Enter a sentence; ");
		sentence = sc.nextLine().toLowerCase();

		sentenceC1 = deleteSpaces(sentence);
		sentenceC2 = invertString(deleteSpaces(sentence));

		if (sentenceC1.equalsIgnoreCase(sentenceC2)) {
			System.out.println("The sentence is a palindrome.");
		} else {
			System.out.println("The sentence is NOT a palindrome.");
		}

		sc.close();
	}

	// Function to delete spaces from a sentence (returns new string object.).
	static String deleteSpaces(String sentence) {

		String spacelessSentence = "";

		for (int i = 0; i < sentence.length(); i++) {

			char c = sentence.charAt(i);

			if (!(Character.isSpaceChar(c))) {

				spacelessSentence = spacelessSentence + c;

			}

		}

		return spacelessSentence;
	}

	// Function to invert a string (Returns new string object).
	static String invertString(String sentence) {

		String invertedString = "";

		for (int i = 0; i < sentence.length(); i++) {

			invertedString = sentence.charAt(i) + invertedString;
		}

		return invertedString;

	}
	
	

}
