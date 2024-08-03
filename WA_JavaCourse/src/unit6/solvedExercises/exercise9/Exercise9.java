package unit6.solvedExercises.exercise9;

import java.util.Scanner;

/*
 * Input a phrase word by word from the keyboard and display the 
 * complete phrase, separating the entered words with spaces. 
 * Stop reading the phrase when any of the entered words is the 
 * string "end" written in any combination of uppercase and 
 * lowercase letters. The string "end" will not appear in the 
 * final phrase.
 */
public class Exercise9 {

	final static String END_STRING = "end";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = "";
		String sentence = "";

		System.out.println("Enter words in ");

		do {
			// Putting the concatention before the exit condition check avoids the word END
			// being introduced into the final sentence.
			sentence = sentence + word + " ";

			System.out.println("Enter a word:");

			word = (sc.nextLine().toLowerCase().strip());

		}
		// While the word is no equal to the ending string.
		while (!(word.equals(END_STRING)));

		System.out.println("----------------");
		System.out.println(sentence);
		
		sc.close();

	}

}