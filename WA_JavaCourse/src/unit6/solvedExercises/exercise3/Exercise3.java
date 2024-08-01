package unit6.solvedExercises.exercise3;

import java.util.Scanner;

/* 
 * Design the game <Guess the Password>. 
 * The mechanics of the game are as follows: 
 * The first player enters the password, then the second player 
 * must type words until they guess it. Create two versions. 
 * In the first version, the game is made easier by indicating 
 * whether the entered word is alphabetically greater or less than
 *  the password. In the second version, the program will display 
 *  the length of the password and a string with the correct 
 *  characters in their respective places and asterisks in the 
 *  incorrect ones.
 */
public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String pass;
		String guess = null;

		pass = askForPassword(sc, true);

		int gamemode = selectGameMode(sc);

		do {

			if (gamemode == 1) {
				guess = askForPassword(sc);
				compareGuessAlphabetically(pass, guess);
			}
			if (gamemode == 2) {
				System.out.println("Password length: " + pass.length());
				guess = askForPassword(sc);
				printPasswordCoincidences(pass, guess);
			}

		} while (!checkWinStatus(pass, guess));

		System.out.println(" - - - - - - - YOU WIN! - - - - - - - ");
		
		sc.close();

	}

	static int selectGameMode(Scanner sc) {

		System.out.println("Please select a game mode:\n1- Alphabetical hint\t2- Character indicator hint.");
		int mode = sc.nextInt();
		sc.nextLine();
		return mode;

	}

	static boolean checkWinStatus(String password, String guess) {
		return guess.equalsIgnoreCase(password);
	}

	static void compareGuessAlphabetically(String password, String guess) {

		String result;

		if (password.compareTo(guess) < 0) {
			result = "The player's guess is alphabetically inferior.";
		} else if (password.compareTo(guess) > 0) {
			result = "The player's guess is alphabetically superior.";
		} else {
			result = "The player's guess is alphabetically identical.";
		}

		System.out.println(result);
	}

	static void printPasswordCoincidences(String password, String guess) {

		char checker, pChar, gChar;
		int checkLength;

		if (password.length() < guess.length()) {
			checkLength = password.length();
		} else {
			checkLength = guess.length();
		}

		for (int i = 0; i < checkLength; i++) {
			checker = '_';

			pChar = Character.toLowerCase(password.charAt(i));
			gChar = Character.toLowerCase(guess.charAt(i));

			if (Character.compare(pChar, gChar) == 0) {
				checker = '*';
			}
			System.out.print(" " + checker);

		}

		System.out.println();

	}

	static String askForPassword(Scanner sc, boolean isPassword) {

		isPassword = false;
		String password;

		System.out.println("Enter the password the other player shall guess.");
		password = sc.nextLine();

		return password;
	}

	static String askForPassword(Scanner sc) {

		String password;

		System.out.println("Enter the your guess.");
		password = sc.nextLine();

		return password;
	}

}
