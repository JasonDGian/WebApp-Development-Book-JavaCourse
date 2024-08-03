package unit6.solvedExercises.exercise11;

import java.util.Scanner;

/*
 * There is the following relationship of letters:
 * Set 1: e i k m p q r s t u v
 * Set 2: p v i u m t e r k q s
 *
 * With this relationship, it is possible to encode a text by 
 * converting each letter from set 1 to its corresponding letter
 * in set 2. The rest of the letters are not modified. 
 * The sets are used to encode both uppercase and lowercase 
 * letters, always showing the encoding in lowercase.
 * For example, the word PaquiTo is encoded as matqvko.
 * Write a program that encodes a text. To do this, implement 
 * the corresponding function that returns the encoded character
 * according to sets 1 and 2 provided.
 */

public class Exercise11 {

	private static final char[] ENCODE_CHARS_1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
	private static final char[] ENCODE_CHARS_2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

	public static void main(String[] args) {

		// Test:
		// Hello world, I am encoded! -> Hpllo Woeld, v au pncodpd!

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence to encode:");

		String texto = sc.nextLine();

		System.out.println(texto);

		texto = encodeString(texto);

		System.out.println(texto);
	}

	static String encodeString(String textToEncode) {

		String encodedText = "";

		for (int i = 0; i < textToEncode.length(); i++) {

			encodedText = encodedText + String.valueOf(encodeCharAux(textToEncode.charAt(i)));

		}

		return encodedText;

	}

	// Auxiliary function that simplifies character encoding. Not necessary but
	// useful.
	static char encodeCharAux(char c) {

		return encodeChar(ENCODE_CHARS_1, ENCODE_CHARS_2, c);
	}

	// Character encoding function.
	static char encodeChar(char[] charsToEncode, char[] encodingChar, char character) {

		char encodedCharacter = character;

		int charIndex = String.valueOf(charsToEncode).indexOf(character);

		if (charIndex > -1) {
			encodedCharacter = String.valueOf(encodingChar).charAt(charIndex);
		}

		return encodedCharacter;

	}

}
