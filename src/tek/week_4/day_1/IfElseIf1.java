package tek.week_4.day_1;

import java.util.Scanner;

public class IfElseIf1 {

	public static void main(String[] args) {


		String grade = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Percentages");
		int examResult = input.nextInt();

		if (examResult >= 90 && examResult <= 100 ) {
			grade = "A";
			System.out.println("Your Grade is: " + grade);
		} else if (examResult < 90 && examResult >=80 ) {
			grade = "B";
			System.out.println("Your Grade is: " + grade);
		} else if (examResult < 80 && examResult > 70) {
			grade = "C ";
			System.out.println("Your Grade is: " +grade);
		} else {
		
			System.out.println("You are Failed");
			
			
	}

}
}

