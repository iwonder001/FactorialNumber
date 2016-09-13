import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Factorial Calculator!");
		
		String cont;
		cont = "y";

		// make while loop. Must make y= true and false to stop the loop
		while (cont.equalsIgnoreCase("y")) {

		Scanner input = new Scanner(System.in);
		// must use data type long
		// capture user input and put into for loop
		System.out.println("Enter an interger that's greater than 0 but less than 10: ");
		long greater = input.nextLong();

		// making a place to hold the result
		long result = 1;
		// loop goes around one at a time. The results are an primitive data
		// type (long) so it replaces current info in place in stack and erases
		// the previous result from the loop.
		for (int i = 1; i <= greater; i++) {
			result *= i;
			
			// result = result * i;
			// result starts 1 * i (1) = 1
			// (take new result value from above line and now it is the result in the next loop go around)
			// result 1 * i (2) = 2
			// result 2 * i ( 3) = 6

		} // for loop
		System.out.println("The factorial of " + greater + " is " + result);
		
		/*going from capturing user input of a number (long) to capturing user input of a string (letter) 
		 next, you have to clear out \n (new line/line character) by doing 
		 cont = input.nextLine();
		 cont = input.nextLine();   twice   */
		System.out.println("Continue? (y/n):");
		cont = input.nextLine();
		cont = input.nextLine();
		
		
		}//while loop
		
	}// psvm

}// class
	

