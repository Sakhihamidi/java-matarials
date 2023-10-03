package tek.week_7.day_3;

public class ForElahaloops {
	public static void main(String[] args) {
		

	//Syntax for while loop

	        //int i = 0; initialization

	        // while (condition) {

	            //Statement/ block of code

	        //i++.. increment/decre

	        //}
	
	int number3 = 1;
	while (number3 <= 10) {
		System.out.println( number3);
		number3++;
	}
System.out.println("+++++++++++++++++++++++++++++++++++++++");

	//Syntax for 'for' loop

	        //for (int i = 0; condition; increment/decrement){

	        //block of code.. statement

	        //}
	for (int number = 1; number < 11; number++) {
		System.out.println(number);
	}

	System.out.println("+++++++++++++++++++++++++++++++++++++++");

	
	//Syntax for 'do..while' loop

	        //int i = 0; initialization

	        //do {

	        //block of statement, increment and decrement

	        //} while (condition);
		int number1 = 1;
		do {
		System.out.println(number1);
		number1++;
		}while (number1 <= 10);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
// using for loop to print array int
		int[] numbers = {1,2,3,4,5,100,200,49,31};
		
		for (int number : numbers) {
			System.out.println(number  + " ");
		}
		
/// using for loop to print array string

		
		String[] names = { "Bob", "Eric", "Trevor", "Tony" };
		
			
		for (int index = names.length - 1; index >= 0; index--) {
			System.out.println(names[index]);
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		// 2d Array print
		
		String[][] names1 = { {"Bob", "Erin"}, 
							  {"Trevor", "Lydia", "Alex"}};
		
		

		for (int row = 0; row < names1.length; row++) {
			for (int col = 0; col < names1[row].length; col++) {
				//if (names[row][col].equals("Alex")) {
					System.out.println(names1[row][col]);
				} 
			}
	}
	}
}
