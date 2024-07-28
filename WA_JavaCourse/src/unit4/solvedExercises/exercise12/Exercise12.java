package unit4.solvedExercises.exercise12;

// Design a recursive function that calculates the nth term of the Fibonacci series.
public class Exercise12 {

	private static int fibonacciNthTerm(int termNum) {

		int res;

		if (termNum == 0 || termNum == 1) {
			res = 1;
		} 
		
		else {
			res = (fibonacciNthTerm(termNum - 1) + fibonacciNthTerm(termNum - 2));
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		System.out.println(fibonacciNthTerm(2));

		System.out.println(fibonacciNthTerm(10));

	}

}
