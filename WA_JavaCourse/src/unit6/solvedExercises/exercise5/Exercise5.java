package unit6.solvedExercises.exercise5;

/*
 * Write a function that takes a string and returns in in inverse order.
 */
public class Exercise5 {

	public static void main(String[] args) {

		System.out.println(invertString("Hello World!"));

	}

	static String invertString(String sentence) {

		String invertedString = "";

		for (int i = 0; i < sentence.length(); i++) {

			invertedString = sentence.charAt(i) + invertedString;

		}

		return invertedString;

	}

}
