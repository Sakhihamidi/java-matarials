package tek.week_4.day_1;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter p for Pass or f for Fail");
		
		String examResult = inputs.next();
		
		inputs.close();
		
		if (examResult.equals("f")) {
			System.out.println("You have failed the Exam");
		} 
		else if (examResult.equals("p")){
			System.out.println("You have Passed the Examd");
		}
		
		else {
			System.out.println(" You Entered a wrong Value");
		}
		
	}

}
