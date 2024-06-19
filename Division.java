package exception;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        try {
	            // Prompt the user to enter the numerator
	            System.out.print("Please enter the numerator: ");
	            double numerator = scanner.nextDouble();

	            // Prompt the user to enter the denominator
	            System.out.print("Please enter the denominator: ");
	            double denominator = scanner.nextDouble();

	            // Perform the division
	            double result = numerator / denominator;

	            // Display the result
	            System.out.println("The result of the division is: " + result);
	        } catch (ArithmeticException e) {
	            // Handle the exception if the denominator is zero
	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
	        } catch (InputMismatchException e) {
	            // Handle the exception if the input is not a number
	            System.out.println("InputMismatchException caught: Please enter valid numbers.");
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }

	        // Continue with the rest of the program
	        System.out.println("Program continues after handling the exception.");
	}

}
