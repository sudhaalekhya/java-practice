package day1;

public class WrapperExample {

	public static void main(String[] args) {
		// Autoboxing: Converting primitive types to wrapper objects
        Integer intObj = 100; // Autoboxing: converting int to Integer
        Double doubleObj = 3.14; // Autoboxing: converting double to Double
        Boolean boolObj = true; // Autoboxing: converting boolean to Boolean

        // Unboxing: Converting wrapper objects to primitive types
        int intValue = intObj; // Unboxing: converting Integer to int
        double doubleValue = doubleObj; // Unboxing: converting Double to double
        boolean boolValue = boolObj; // Unboxing: converting Boolean to boolean

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Boolean value: " + boolValue);

        // Performing arithmetic operations using wrapper objects
        int sum = intObj + 50; // Unboxing: converting Integer to int
        double product = doubleObj * 2; // Unboxing: converting Double to double

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
	}

}
