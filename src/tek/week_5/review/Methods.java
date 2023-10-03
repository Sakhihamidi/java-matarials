package tek.week_5.review;

public class Methods {
	
	public static void basicOperation(double inputOne, char operation, double inputTwo) {// method without a return type
		// +, -, *, /

		double result = 0;
		switch (operation) {

		case '+':
			result = inputOne + inputTwo;
			break;

		case '-':
			result = inputOne - inputTwo;
			break;

		case '*':
			result = inputOne * inputTwo;
			break;

		case '/':

			if (inputTwo == 0) {

				System.out.println("You cannot devide a numbe by zero");
				return;
			} else {
				result = inputOne / inputTwo;
				break;
			}

		default:
			System.out.println("Invalid Operation");
		}
		System.out.println("Result of the operation: " + result);

	}

	public static void main(String[] args) {

		// call this basicOperation in the main method
		basicOperation(50, '+', 10);

	}
	

}
