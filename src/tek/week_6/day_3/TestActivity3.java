package tek.week_6.day_3;

import java.util.Scanner;

public class TestActivity3 {
	
	  public static void main (String [] args){
				    Scanner userInput = new Scanner(System.in);

				    System.out.println("Enter First Number");
				    int firstNumber = userInput.nextInt();
				    System.out.println("Enter Second Number");
				    int secondNumber = userInput.nextInt();
				    System.out.println("Enter an operation you want like:add, Minuse, Multiplication, Devision");
				    
				    try (Scanner operator1 = new Scanner(System.in)) {
						String operation = operator1.nextLine();
						
						System.out.println(operation);
						userInput.close();
						
						
						switch (operation) {
						case "add":
							System.out.println(firstNumber + secondNumber);
							break;
						case "Minuse":
							System.out.println(firstNumber - secondNumber);
							break;
						case "Multiplication":
							System.out.println(firstNumber * secondNumber);
							break;
						case "Devision":
							System.out.println(firstNumber / secondNumber);
							break;
						default:
							System.out.println("Wrong entry");
							break;

	          // anoter way


	        
	    
	  }
	}
	  }
	
}

