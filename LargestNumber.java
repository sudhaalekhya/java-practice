
public class LargestNumber {
	// Method to find the largest of three numbers
    public static int findLargest(int num1, int num2, int num3) {
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        return largest;
    }
	public static void main(String[] args) {
		// Test the findLargest method with different sets of numbers
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        int largest = findLargest(number1, number2, number3);
        System.out.println("The largest number is: " + largest);

        // You can also test with other values
        System.out.println("The largest number is: " + findLargest(15, 25, 5));
        System.out.println("The largest number is: " + findLargest(7, 2, 3));
	}

}
