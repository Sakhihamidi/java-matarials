package tek.week_4.day_1;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		String grade = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Grade as A, B, C or F in CAPITAL letter");
		String examResult = input.next();

		if (examResult.equals("A")) {
			grade = "Excellent";
			System.out.println("Your Grade is: " + grade);
		} else if (examResult.equals("B")) {
			grade = "Really Good";
			System.out.println("Your Grade is: " +grade);
		} else if (examResult.equals("C")) {
			grade = "Good ";
			System.out.println("Your Grade is: " +grade);
		} else {
			grade = "Failed";
			System.out.println("Your Grade is: " +grade);
		}

	}

}
