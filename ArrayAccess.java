package exception;

public class ArrayAccess {

	public static void main(String[] args) {
		 // Initialize an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an element at index 10, which is out of bounds
            int value = numbers[10];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Continue with the rest of the program
        System.out.println("Program continues after handling the exception.");
	}

}
