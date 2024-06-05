
public class Arithmetic {
	// Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

	public static void main(String[] args) {
		// Test the arithmetic methods with different sets of numbers
        double number1 = 10;
        double number2 = 20;

        System.out.println("Addition: " + add(number1, number2));
        System.out.println("Subtraction: " + subtract(number1, number2));
        System.out.println("Multiplication: " + multiply(number1, number2));
        System.out.println("Division: " + divide(number1, number2));

        // You can also test with other values
        System.out.println("Addition: " + add(15.5, 25.3));
        System.out.println("Subtraction: " + subtract(15.5, 25.3));
        System.out.println("Multiplication: " + multiply(15.5, 25.3));
        System.out.println("Division: " + divide(15.5, 25.3));	

	}

}
