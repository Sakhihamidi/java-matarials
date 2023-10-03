package practice.day_2;

public class Abstractionweek8 {
	
	/*
	 * Abstraction is the methodology of hiding the implementation of internal
	 * details and showing the functionality to the users. Example: Mobile Phone. 
	 * A layman who is using mobile phone doesn’t know how it works internally
	 * but he can make phone calls.
	 */
	
	// Abstract Classes:
	// A class which contains abstract keyword in its declaration then it is an 
	// Abstract Class.
	
	/*
	 * • Abstract classes may or may not include abstract methods
	 * 
	 * • If a class is declared abstract then it cannot be instantiated.
	 * 
	 * • If a class has abstract method then we have to declare the class as
	 * abstract class
	 * 
	 * • When an abstract class is subclassed, the subclass usually provides 
	 * implementations for all of the abstract methods in 
	 * its parent class.
	 */
	
	// Abstract Methods
	/*
	 * An abstract method is a method that is declared without an 
	 * implementation(without braces, and followed by a semicolon), 
	 * like this: In order to use an abstract method,
	 *  you need to override that method in sub class.
	 *  abstract public void makeSound();	this is an abstract method
	 *   public void makeSound(){sys("")} this is a normal method	
	 *
	 */
	
	public static void main(String[] args) {
//		var animalObj = new Animal3(); we are not able to make an abstract class object
		var dogObj = new Dog3();
		var  catObj = new Cat3();
		
	
//		animalObj.makeSound(); we canot call abstract class property 
		dogObj.makeSound();
		catObj.makeSound();
}
}

abstract class Animal3 {
	// if the class is abstract it can have abstract method or it can have non abstract method
	// if we have an abstract method we have have its class as abstract
	abstract public void makeSound();	
	
	//now all child have to have this method makesound  and it is a must and define its implementation 
	}

class Dog3 extends Animal3{
	public void makeSound() {
		System.out.println("Dog Barks");
	}
}

class Cat3 extends Animal3 {
	public void makeSound() {
		System.out.println("Cat Meow");
		// if I remove this method it gives error
	}
}

