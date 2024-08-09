package unit7.solvedExercises.exercise7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Design the `Text` class that manages a string of characters with the
 * following features:
 * 
 * - The string will have a maximum length specified in the constructor. - It
 * allows adding a character at the beginning or the end, as long as the maximum
 * length is not exceeded, meaning there is available space. - Similarly, it
 * allows adding a string at the beginning or the end of the text, as long as
 * the maximum length is not exceeded. - It is necessary to know how many
 * uppercase and lowercase vowels are in the text. - Each `Text` object must
 * know the date it was created as well as the date and time of the last
 * modification made. - There should be a method that displays the information
 * managed by each `Text` object.
 */

public class Text {

	// Variables.
	private String textBody = "";
	private int maxLength;
	private LocalDateTime creationTime;
	private LocalDateTime lastModificationTime;

	// Date time formatter.
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss - yyyy-MM-dd");

	// Constructor.
	public Text(int maxLength) {

		this.maxLength = maxLength;
		this.creationTime = LocalDateTime.now();
		this.lastModificationTime = LocalDateTime.now();
	}

	// Access Methods.

	public String getTextBody() {

		String text;

		if (this.textBody.isBlank() || this.textBody.isEmpty()) {
			text = "Text is currentl empty.";
		} else {
			text = this.textBody;
		}

		return text;
	}

	// Sets a text body if within length limits.
	public void setTextBody(String textBody) {

		if (this.textBody.length() < this.maxLength) {

			this.textBody = textBody;
			this.lastModificationTime = LocalDateTime.now();

		} else {

			System.out.println("Error: exceding character limit.");

		}

	}

	public int getMaxLength() {
		return this.maxLength;
	}

	// Returns a string with the date of creation.
	public String getCreationDate() {
		return this.creationTime.format(dateTimeFormatter);
	}

	// Returns a string with the date of las modification.
	public String getLastModificationTime() {
		return this.lastModificationTime.format(dateTimeFormatter);
	}

	// Updates the modification date.
	private void updateLastModificationTime() {
		this.lastModificationTime = LocalDateTime.now();
	}

	// There should be a method that displays the information managed by each `Text`
	// object.
	public void printTextDetails() {

		System.out.println("----------------- [ NOTES DETAILS ] -------------------");
		System.out.println("The text maximum length is: " + this.maxLength);
		System.out.println("The text creation date is: " + this.getCreationDate());
		System.out.println("The text last modification date  is: " + this.getLastModificationTime());
		System.out.println("The total amount of vowels found is: " + this.getVowelsCount());
		System.out.println("---------------------------------------------------------");

	}

	// Prefix the currently stored text with a char.
	public void prefixChar(char character) {
		/*
		 * - It allows adding a character at the beginning or the end, as long as the
		 * maximum length is not exceeded, meaning there is available space.
		 */

		if (this.textBody.length() < this.maxLength) {

			textBody = character + textBody;
			updateLastModificationTime();

		} else {

			System.out.println("Error: exceding character limit.");

		}

	}

	// Prefix the currently stored text with a string.
	public void prefixText(String prefixText) {
		/*
		 * - Similarly, it allows adding a string at the beginning or the end of the
		 * text, as long as the maximum length is not exceeded.
		 */

		if (this.textBody.length() < this.maxLength) {

			textBody = prefixText + textBody;
			updateLastModificationTime();

		} else {

			System.out.println("Error: exceding character limit.");

		}

	}

	// Append a char.
	public void appendChar(char character) {
		/*
		 * - It allows adding a character at the beginning or the end, as long as the
		 * maximum length is not exceeded, meaning there is available space.
		 */

		if (this.textBody.length() < this.maxLength) {

			textBody = textBody + character;
			updateLastModificationTime();

		} else {

			System.out.println("Error: exceding character limit.");

		}

	}

	// Append a string of text.
	public void appendText(String prefixText) {
		/*
		 * - Similarly, it allows adding a string at the beginning or the end of the
		 * text, as long as the maximum length is not exceeded.
		 */

		if (this.textBody.length() < this.maxLength) {

			textBody = textBody + prefixText;
			updateLastModificationTime();

		} else {

			System.out.println("Error: exceding character limit.");

		}

	}

	// Counts vowels both uppercase and lowercase.
	public int getVowelsCount() {

		int counter = 0;

		for (char letter : this.textBody.toCharArray()) {

			if (isVowel(letter)) {
				counter++;
			}

		}

		return counter;

	}

	private boolean isVowel(char c) {

		boolean isVowel = false;

		String vowel = "aeiouAEIOUÁÉÍÓÚÀÈÌÒÙÄËÏÖÜ";

		if (vowel.indexOf(c) >= 0) {
			isVowel = true;
		}

		return isVowel;

	}
}