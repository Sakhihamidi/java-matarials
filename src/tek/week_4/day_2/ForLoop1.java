package tek.week_4.day_2;

public class ForLoop1 {

	public static void main(String[] args) {
		// To pring Even numbers from 1 to 10
		
			
			for (int number = 0; number <= 10; number +=2){
			
				System.out.print( number + " ");
				

	}
			
			
	//to print odd numbers
			System.out.println("\n" );
			
			for (int number = 1; number <= 10; number +=2){
			
				System.out.print(number + " ");
			}
			
			System.out.println("\n" );

			
	// if you want to print all numbers from 0 to 10 in reverse order
			
			for (int number = 10; number >= 0; number --){
				
				System.out.print( number + " ");
			}
}
	
}