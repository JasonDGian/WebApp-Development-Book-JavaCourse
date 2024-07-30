# Java notes.   
Here i collect what i consider important or more complex concepts of programming to help me understand concepts as i explain them in written form.

- [Recursive functions](#recursive-functions).
- [Binary search](#binary-search-arrays).
--- 

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
## Binary search (Arrays).   
Binary search is an efficient tool to search for values within a **sorted array**. To use the binary search algorithm with an array, we call `Arrays.binarySearch(array, value)`. In this line, `array` is the array in which we wish to perform the search, and `value` is the value we wish to check if present or not.

**Returns:**
- If the value is present: Returns the index of the value within the array.
- If the value is not present: Returns a negative number. 
	-	This negative number is calculated as `-(insertion point) - 1 ` , where the insertion point is the index where the value would be inserted to maintain the sorted order.

> [!NOTE]   
> _TL;DR:_ If the function returns 0 or a greater positive number, it means the value exists within the array. On the contrary, if the function returns a negative number, it means the value is absent.

**Example:**
```
public static void main(String[] args) {
	
	int[] array = {1,2,3,4,5,6,7};
	
	// Will return 0
	System.out.println( Arrays.binarySearch(array, 1) );
	
	// Will return 4
	System.out.println( Arrays.binarySearch(array, 5) );
	
	// Will return negative.
	System.out.println( Arrays.binarySearch(array, 1000) );
	
}
```
  
> [!IMPORTANT]   
> - A binary search will not work unless the array is sorted. This is vital for the algorithm to work correctly. 
> - It is also important to know that the algorithm will stop the search once it finds an instance of the searched value. If your searched value is repeated within the array, the algorithm will return the index of one of the instances, but not necessarily the first occurrence.

   
---

## Copying Arrays.
To copy arrays we can use two methos. One belongs to the Arrays api and the other to System. 

### System.arraycopy( org, orgPos, dest, destPos, elements ):
With this method we can copy and array into another array deciding certain aspects of the process. We have to specify, in this order:
   
1. The origin array.
2. The origin starting index.
3. The destination array.
4. The destintation starting point.
5. The number of elements to copy.


**Example.**
This example copies the content of both `arrayA` and `arrayB` into `arrayAB`
```
int[] arrayA = {1,2,3};
int[] arrayB = {4,5,6,7};

int[] arrayAB =  new int[7];

System.arraycopy(arrayA, 0, arrayAB, 0, 3);
System.arraycopy(arrayB, 0, arrayAB, 3, arrayB.length);

// Origin - Starting index - Destiny - Starting index - elements to copy

for (int elemen: arrayAB) {
	System.out.println(elemen);
}
```
>[!IMPORTANT]
>Working with this method we must pay attention to the arrays length to avoid IndexOutOfBounds errors.