package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            // Handle the exception
            System.out.println("InputMismatchException caught: Please enter a valid integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }

        // Continue with the rest of the program
        System.out.println("Program continues after handling the exception.");
	}

}
