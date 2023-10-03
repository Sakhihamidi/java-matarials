package tek.week_3.day_2;

public class CastingInJava {

	//Terminologies 
		//Instance Variables 
		//Declaring a variable. there no data assign yet. 
		int age;
		//Variables declared and assigned
		static String name = "John";
		
		public static void main(String[] args) {
			//Local Variable to the main method
			String city = "Alexandria";
			System.out.println(name);
			
			byte number1 = 10; 
			byte number2 = 20; 
			
			int result = number1 + number2; 
			
			double price = 10.12; 
			double quantity = 20.21; 
			
			double result2 = price * quantity; 
			
			//Force java to change the type of a value. 
			//Type casting
			int value = (int) price; 
			
			//precedence in java using (); 
			double number4 = 0.1234; 
			
			int result3 = (int) (number4 * 10);
			System.out.println(result3);
		}
		
	}
