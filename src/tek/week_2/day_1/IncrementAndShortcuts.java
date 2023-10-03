package tek.week_2.day_1;

public class IncrementAndShortcuts {
	
	public static void main(String[] args) {

		//Increment (Addition) and decrement (Subtraction)

		int number = 0;
		//this way not preferred
		number = number + 5; //increment by 5
		number = number + 5; //increment by 5
		number = number + 5; //Increment by 5
		System.out.println(number);

		//this way preferred
		//Incremental shortcut. 
		int value = 10; 
		//value = value + 5; 
		value += 5;
		value += 5; 
		value += 5; 
		System.out.println(value);
		//this way preferred
		//If incrementing by 1; 
		int rate = 100; 
		rate++;
		rate++; 
		rate++; 
		System.out.println(rate);
	

	}

}
