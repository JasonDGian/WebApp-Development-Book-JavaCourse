## Recursive Functions
A recursive function is a function that calls itself until a condition is met. It can be imagined as a function that goes up a staircase and, when the goal is reached, heads back down to handle us the result. To work properly, a recursive function must have the following characteristics:
    
- **Base Case:** Condition to meet.
- **Recursive Call:** A call to itself in case the base case is not met.
- **Code Block Action:** Something that the function does, which includes a mechanism to achieve the base case condition.
- **A Pretty Name:** Because everyone likes pretty names.
   
**Example of a recursive function.**
   
```
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
```
   
> [!WARNING]
> It is important to properly handle the base case variables such as `n` in the example. If we were to use something like `return countToNv2( n-- )` instead of `countToNv2( n - 1 )` the function would fall into an infinite loop because of how the post-decrement `n--` is handled. The pre-decrement `--n` would work but is best to avoid this alltogether.

**Example 2: Recursive exponent.**
   
An important observation in this example is that  the variable `double res;` only exists within each instance. Each recursive call to the _recursiveExponent()_ function creates a new instance of the local variable `res` within its own scope. These instances are independent of each other and are not shared between the recursive calls.


```
	// Recursive exponent calculation function.
	private static double recursiveExponent(int base, int exponent) {

		double res; // Declare a variable to store the result

		if (exponent == 0) { // Base case: when the exponent is 0
			res = 1; // Any number raised to the power of 0 is 1
		} else { // Recursive case: when the exponent is not 0
			--exponent; // Decrement the exponent by 1
			res = base * recursiveExponent(base, exponent); // Multiply the base by the result of the recursive call
															// with the decremented exponent
		}

		return res; // Return the result

	}
```

