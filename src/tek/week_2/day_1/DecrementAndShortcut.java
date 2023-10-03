package tek.week_2.day_1;

public class DecrementAndShortcut {

	public static void main(String[] args) {
		//this way not preferred
		int number = 100; 
		number = number - 10; //Decrementing by 10 (Subtracting)
		number = number - 10; 
		System.out.println(number);

		//this way preferred
		//decrement shortcut
		int count = 30; 
		// count = count - 2; 
		count -= 2; 
		count -= 2; 
		System.out.println(count);

		//this way preferred
		//Decrementing by 1 
		int value = 10; 
		value --; 
		value --; 
		System.out.println(value);
	}

}
