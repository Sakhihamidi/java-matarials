package tek.week_7.day_1;

public class Dog  extends Animal{
	
	/*
	 * Derived Class - Dog: 
	 * Inherits from the Animal class.
	 * Create makeSound()method to print "Woof! Woof!"
	 */
	
	public Dog(String name) {
		super(name);
	}
	
	void makeSound() {
		System.out.println("Woof! Woof!");
	}
		
	}


