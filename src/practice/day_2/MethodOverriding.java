package practice.day_2;

public class MethodOverriding {
	
//Method Overriding allows a subclass or child class to provide a specific implementation of a method 
//that is already exist in parent class.
	
// overriding is declearing a method in Child class that is already exist in the parent class, 
//so that child class can have its own implementation

// Rules for Method Overriding
//The method must have the same name as in the parent class.
//The method must have the same parameter as in the parent class.
//There must be in 2 classes (inheritance)
	
// Simply Overriding means to have the parend class method in child class.

	
	public static void main(String[] args) {

	BMethodOverriding bObj = new BMethodOverriding();
		bObj.show();
	}	
}

class AMethodOverriding{
	public void show() {
		System.out.println("classs A showing");
	}
}
class BMethodOverriding extends AMethodOverriding {
	public void show() {
		System.out.println("classs B showing");
	}
}
