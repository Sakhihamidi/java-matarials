package tek.week_5.day_1;

import java.util.Random;

public class ReviewActivity5 {
	
	
		public static void main(String[] args) {
			// Question #5: Create a java program that will generate Random numbers 
			//from 0
			// all the way to 20 and output the random number.
			
			Random random = new Random();
			
			int randomNumber = random.nextInt(20);
			
			System.out.println(randomNumber);
			
		}
		
		

}
