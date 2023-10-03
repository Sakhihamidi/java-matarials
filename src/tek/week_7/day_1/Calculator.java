package tek.week_7.day_1;

import java.util.Scanner;

public class Calculator {
	/*
	 * Instructions steps ask user to input first number ask user to input second
	 * number ask user to input operation operator show the result Note: First
	 * number, second number and operator is input as user data in Replit and you
	 * don't have to enter any number and operator in your code.
	 * 
	 * #Expected output
	 * 
	 * Please enter your first number
	 * 
	 * Please enter your second number
	 * 
	 * please enter your operator
	 * 
	 * Test expected output 19.5
	 */
	public static void main (String [] args){
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("Please your enter first number");

	    double firstNumber = userInput.nextDouble();
	    System.out.println("Please enter your second number");
	    double secondNumber = userInput.nextDouble();
	    System.out.println("please enter your operator");
	    char operator =userInput.next().charAt(0);
	    userInput.close();
	    
	    if (operator == '+'){
	    	System.out.println(firstNumber+secondNumber);
	    }
	    if (operator == '-'){
	    	System.out.println(firstNumber-secondNumber);
	    }
	    if (operator == '*'){
	    	System.out.println(firstNumber*secondNumber);
	    }
	    if (operator == '/'){
	    	System.out.println(firstNumber/secondNumber);
	    }else {
	    	System.out.println("Your input is wrong");
	    
	    }
	    


}

}
