import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Factorial Calculator!");
		
		long num = 0;
		String greaterLess;		
		
		//while (cont.equalsIgnoreCase("Y")) {
			
			Scanner input = new Scanner(System.in);
			//must use data type long
			System.out.println("Enter an interger that's greater than 0 but less than 10: ");
		    long greater =input.nextLong();
		    
			long result = 1;
			for (int i = 1; i<=greater; i++) {
				result *=i;
				
//				result starts 1 * i (1) = 1
//				result 1 * i (2) = 2
//				result 2 * i ( 3) = 6
				
				
			
				
			}//for loop
			System.out.println("The factorial of " + greater + " is " + result );	
			
		}//psvm
		
		
		
	}//class
	//capture user input and put into for loop
	//make while loop.  Must make y= true and false to stop the loop
		
		

