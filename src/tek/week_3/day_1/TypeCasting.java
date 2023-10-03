package tek.week_3.day_1;

public class TypeCasting {
public static void main(String[] args) {
		
		//primitive data types. 
		//byte short int long Natural numbers
		//float and double for floating numbers (Decimal numbers)
		
		//Variable = changeable. 
		byte number1 = 10; 
		byte number2 = 20; 
		
		//Any arithmetic operation on small data type
		//should store into larger data type. 
		int result = number1 + number2; 
		
		double number3 = 10.0; 
		double number4 = 8.0; 
		
		//Any arithmetic operation of decimal 
		//should store in decimal variable. 
		double result2 = number3 + number4; 

		//force java to store double into an int
		double value = 110.89; 
		//Casting to smaller data type. 
		int castedValue = (int) value; 
		System.out.println(castedValue);
		
		int result3 = (int)(value * 10 + 29); 
		System.out.println(result3);
		
		double number5 = 0.236;
		//() is precedence in Java for Arithmetic operations. 
		int result4 = (int) (number5 * 10); 
		System.out.println(result4);
		
	}		
	
	}