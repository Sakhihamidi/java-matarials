package tek.week_6.day_3;

import java.util.Scanner;

public class TestActivity2 {

	public static void main (String [] args){
				    Scanner userInput = new Scanner(System.in);

				    System.out.println("Enter First Number");
				    int firstNumber = userInput.nextInt();
				    System.out.println("Enter Second Number");
				    int secondNumber = userInput.nextInt();
				    System.out.println("Enter an operation you want like:add, Minuse, Multiplication, Devision");
				    
					Scanner userOpertion = new Scanner(System.in);
				    String operation = userOpertion.nextLine();
				    
					if (operation.equals("add")) {
						System.out.println(firstNumber + secondNumber);
					}				
					else if (operation.equals("Minuse")) {
						System.out.println(firstNumber - secondNumber);
					}	
					else if (operation.equals("Multiplication")) {						
						System.out.println(firstNumber * secondNumber);
					}
					else if (operation.equals("Devision")) {
						System.out.println(firstNumber / secondNumber);
					
					}else {
							System.out.println("Your Input is Wrong");
						}
					
						

	}
				    

	}
	

