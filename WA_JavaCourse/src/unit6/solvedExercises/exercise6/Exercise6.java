package unit6.solvedExercises.exercise6;

import java.util.Scanner;

/*
 *  "Write a program that asks for the user's full 
 *  name and displays it without vowels."
 */
public class Exercise6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");

		System.out.println(deleteVowels(sc.nextLine()));

		sc.close();
	}

	
	static boolean isVowel(char c) {

		boolean isVowel = false;

		String vowel = "aeiouAEIOUÁÉÍÓÚÀÈÌÒÙÄËÏÖÜ";

		if (vowel.indexOf(c) >= 0) {
			isVowel = true;
		}

		return isVowel;

	}

	static String deleteVowels(String name) {

		String strippedName = "";

		for (int i = 0; i < name.length(); i++) {

			if (!(isVowel(name.charAt(i)))) {
				strippedName = strippedName + name.charAt(i);
			}

		}

		return strippedName;
	}

}
