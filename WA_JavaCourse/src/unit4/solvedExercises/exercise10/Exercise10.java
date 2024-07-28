package unit4.solvedExercises.exercise10;

/*
 * Design a function that calculates 'a^n', where 'a'
 * is a real number and 'n' is a non-negative integer. 
 * Implement both an iterative and a recursive version.
 */

public class Exercise10 {

	// VERSION 1 - Testing.
	// Recursive function test.
	private static int countToN(int n) {

		// Basecase - This is the case in which the recursiveness would "stop and head
		// back"
		if (n <= 0) {
			return n;
		}

		// Recursive call "forward".
		else {
			System.out.println(n); // Piece of code I want to execute.

			// cuentaHastaN((n--)); -> Does not decrement before the call - This would cause
			// infinite recursion.

			// Decrement for the base case check.
			--n;
			// return a call to the function itself for recursivity.
			return countToN(n);
		}
	}

	// IMPROVED VERSION - Testing
	// Recursive function to count down from n to 1.
	private static int countToNv2(int n) {

		// Base case - This is the case in which the recursion stops.
		if (n <= 0) {
			return n;
		}

		// Print the current value of n.
		System.out.println(n);

		// Recursive call with the decremented value of n.
		return countToNv2(n - 1);
	}

	// Recursive exponent calculation function.
	private static double recursiveExponent(int base, int exponent) {

		double res; // Declare a variable to store the result

		if (exponent == 0) { // Base case: when the exponent is 0
			res = 1; // Any number raised to the power of 0 is 1
		}

		else { // Recursive case: when the exponent is not 0
			--exponent; // Decrement the exponent by 1
			res = base * recursiveExponent(base, exponent); // Multiply the base by the result of the recursive call
															// with the decremented exponent
		}

		return res; // Return the result

	}

	// Looping exponent calculation function.
	private static double loopExponent(int base, int exponent) {

		double result = 1; // Initialize the result variable to 1.

		if (exponent == 0) { // Base case: when the exponent is 0.
			
			result = 1; // Any number raised to the power of 0 is 1.
		} 
		
		else { // When the exponent is not 0.
			
			for (int i = 0; i < exponent; i++) { // Loop from 0 to exponent - 1.
				
				result = result * base; // Multiply result by base in each iteration.
			}
		}

		return result; // Return the calculated result.
	}

	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		countToN(10);
		countToNv2(20);

		System.out.println(recursiveExponent(2, 3));

		System.out.println(loopExponent(2, 0));
		System.out.println(loopExponent(2, 1));
		System.out.println(loopExponent(2, 2));
		System.out.println(loopExponent(2, 3));
		
		
	}

}
