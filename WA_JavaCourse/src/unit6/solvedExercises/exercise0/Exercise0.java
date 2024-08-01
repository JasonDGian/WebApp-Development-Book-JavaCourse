package unit6.solvedExercises.exercise0;

public class Exercise0 {

	public static void main(String[] args) {

		String newString = "Hello world!";
		String newString2 = " hello WORLD! ";

		// Raw comparison.
		System.out.println(newString.equals(newString2));

		// After stripping and case insensitive.

		System.out.println
		( 
				newString.equalsIgnoreCase
				( 
						newString2.strip() 
				) 
		);
		
		System.out.println( newString.charAt( newString.length()-1 ) );
		
		String newString3 = "HELLO";
		String newString4;
		
		newString4 = newString3 + newString2.substring(6) ;
		
		System.out.println(newString4);
		
		

	}

}
