package unit6.solvedExercises.exercise8;

/*
 * The inhabitants of Javaland have a somewhat strange language; 
 * when they speak, they always begin their sentences with 
 * "Javalin javalon," then make a more or less long pause 
 * represented by tabulations, and then express the message. 
 * There is a dialect that does not begin its sentences with the 
 * aforementioned phrase but always ends in a more or less prolonged 
 * silence and the phrase "javalen len len." The task is to design 
 * a translator that, first, tells us if the entered sentence is 
 * written in the language of Javaland, and if so, shows us only 
 * the message without the phrases. 
 */

public class Exercise8 {

	private static final String DIALECT_PREFIX = "javalin javalon";
	private static final String DIALECT_SUFFIX = "javalen, len, len";

	public static void main(String[] args) {

		String sentence1 = "Javalin javalon\t           Hello, how are you ?";
		String sentence2 = "Good, thanks, how about you?    \t   Javalen, LEN, len";
		String sentence3 = "JavaLIN JAVAlon\t      Why fine, thanks for asking!";

		System.out.println(getDialectMessage(sentence1));

		System.out.println(getDialectMessage(sentence2));

		System.out.println(getDialectMessage(sentence3));

	}

	// Check if is dialect with prefix.
	static boolean isJavalandPrefix(String sentence) {

		boolean isJavalandLang = false;

		if (sentence.toLowerCase().startsWith(DIALECT_PREFIX)) {
			isJavalandLang = true;
		}

		return isJavalandLang;
	}

	// Check if is dialect with suffix.
	static boolean isJavalandSuffix(String sentence) {

		boolean isJavalandLang = false;

		if (sentence.toLowerCase().endsWith(DIALECT_SUFFIX)) {
			isJavalandLang = true;
		}
		return isJavalandLang;
	}

	static String getDialectMessage(String sentence) {

		if (isJavalandPrefix(sentence)) {

			sentence = sentence.substring(DIALECT_PREFIX.length()).strip();

		}

		else if (isJavalandSuffix(sentence)) {

			// Structured this way for readability.
			int endIndex = sentence.length() - DIALECT_SUFFIX.length();

			sentence = sentence.substring(0, endIndex).strip();
		}

		else {
			sentence = "Unknown dialect.";
		}

		return sentence;

	}

}
