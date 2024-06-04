package operators;

public class ShiftOpEx {

	public static void main(String[] args) {
		  int num = 10; // Binary representation: 0000 1010
	        
	        // Left shift by 2 positions
	        int result1 = num << 2; // Binary representation after left shift: 0010 1000
	        System.out.println("Left Shift Result: " + result1); // Output: 40
	        
	        // Right shift by 2 positions
	        int result2 = num >> 2; // Binary representation after right shift: 0000 0010
	        System.out.println("Right Shift Result: " + result2); // Output: 2
	        
	        // Unsigned right shift by 2 positions
	        int num2 = -10; // Binary representation: 1111 0110
	        int result3 = num2 >>> 2; // Binary representation after unsigned right shift: 0011 1101
	        System.out.println("Unsigned Right Shift Result: " + result3); // Output: 1073741813
	    }
	
	}


