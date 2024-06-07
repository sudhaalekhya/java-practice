package functions;
import java.util.Scanner;
public class VotingEligibilityChecker {
	 private int birthYear;
	    private int currentYear;
	    private int age;

	    // Constructor to initialize birthYear and currentYear
	    public VotingEligibilityChecker(int birthYear) {
	        this.birthYear = birthYear;
	        this.currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
	        this.age = calculateAge();
	    }

	    // Method to calculate age
	    private int calculateAge() {
	        return currentYear - birthYear;
	    }

	    // Method to check voting eligibility
	    public boolean isEligibleToVote() {
	        return age >= 18;
	    }

	    // Method to display result
	    public void displayResult() {
	        System.out.println("You are " + age + " years old.");
	        if (isEligibleToVote()) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote.");
	        }
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt user to enter birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Create an instance of VotingEligibilityChecker
        VotingEligibilityChecker checker = new VotingEligibilityChecker(birthYear);

        // Display the result
        checker.displayResult();
        
        scanner.close();

	}

}
