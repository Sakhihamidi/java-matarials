package tek.week_5.day_2;
import java.util.Scanner;
public class PracticeActivity {
			
		// Create a method that will take user input, add them together
		// and return the result. 
		public static int sumOfTwoNumbers() {
			Scanner input = new Scanner(System.in);
			int num1, num2, result;
			System.out.println("Enter your first Number: ");
			num1 = input.nextInt();
			System.out.println("Enter your second Number: ");
			num2 = input.nextInt();
//			result = num1 + num2;
//			return result;
			return num1 + num2;
		}
		
		
		public static void main(String[] args) {

			System.out.println(sumOfTwoNumbers());
		}

	}
	
