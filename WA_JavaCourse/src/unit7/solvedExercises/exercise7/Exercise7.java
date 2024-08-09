package unit7.solvedExercises.exercise7;


/**
 * Design the `Text` class that manages a string of characters with the following features:
 * 
 * - The string will have a maximum length specified in the constructor.
 * - It allows adding a character at the beginning or the end, as long as the maximum length is not 
 *   exceeded, meaning there is available space.
 * - Similarly, it allows adding a string at the beginning or the end of the text, as long as the maximum length 
 *   is not exceeded.
 * - It is necessary to know how many uppercase and lowercase vowels are in the text.
 * - Each `Text` object must know the date it was created as well as the date and time of the last modification made.
 * - There should be a method that displays the information managed by each `Text` object.
 */
public class Exercise7 {

	
	public static void main(String[] args) {
		
		Text notes = new Text( 30 );
		
		System.out.println( notes.getCreationDate() );
				
		// Returns empty status message.
		System.out.println( notes.getTextBody() );
		
		notes.setTextBody("world");
		
		System.out.println("----------");
		notes.printTextDetails();
		System.out.println("----------");
		
		System.out.println( notes.getTextBody() );
		
		notes.prefixChar('-');
		
		System.out.println( notes.getTextBody() );
		
		notes.appendChar('!');
		
		System.out.println( notes.getTextBody() );
	
		notes.prefixText("Hello");
		
		System.out.println("----------");
		notes.printTextDetails();
		System.out.println("----------");
	
		System.out.println( notes.getTextBody() );
		
		notes.appendText("\nThis is my notes object!");
		
		System.out.println( notes.getTextBody() );
		
		// Must return error of exceeding characters.
		notes.appendText(" The king of the iron fist tournament is... ");
		notes.prefixChar('E');

		
		// Texting other methods.
		System.out.println("----------");
		notes.printTextDetails();
		System.out.println("----------");
		

		
	}

}




