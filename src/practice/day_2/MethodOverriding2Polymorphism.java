package practice.day_2;

public class MethodOverriding2Polymorphism {
	
	// What is Polymorhpism. 
	/*
	 * Polymorphism allows user to perform a task in multiple ways. 
	 * Let’s break the word Polymorphism and see it, ‘Poly’ means ‘Many’
	 *  and ‘Morphos’ means ‘Shapes’. Assume we have four students and we 
	 * asked them to draw a shape. All the four may draw different 
	 * shapes like Circle, Triangle, and Rectangle.
	 */
	
	// We have two types of polymorphism
	
	// 1. Method OverLoading (Compile Time)- (Static Binding): 
	// A class having multiple methods with same name but different 
	// parameters is called Method Overloading There are three ways
	// to overload a method.
	/*
	 * * Parameters with different data types
	 * • Parameters with different sequence of a data types
	 * • Different number of parameters
	 */
	
	public static void main(String[] args){
	    VehicleV v = new VehicleV();
	    v.move();
	    Car c = new Car();
	    c.move();
	    Bike1 b = new Bike1();
	    b.move();
	  }
	}

	
//Polymorphism is a fancy word that means "many shapes" or "many forms".

class VehicleV{
	  public void move(){
	    System.out.println("Vehicle is moving");
	  }
	}

	class Car extends VehicleV{
	  public void move(){
	    System.out.println("Car is moving");
	  }
	}

	class Bike1 extends VehicleV{
	  public void move(){
	  System.out.println("Bike is moving");
	  }
	}

//------Method Overloading ++++++++++++++++++++++++++++++++++++++++++++++++++++ Method Overriding	
//	ocures in one class						                          occures in two classes 
// Name of Method is same with diffrent number of parameter		name and parameter are samae
// 
	
//1)Method overloading is used to increase the readability of the program.	
//Method overriding is used to provide the specific implementation of the method 
//that is already provided by its super class.
	
//2)Method overloading is performed within class.	
//Method overriding occurs in two classes that have (inheritance) relationship.
	
//3)In case of method overloading, parameter must be different.	
//In case of method overriding, parameter must be same.
	
//4)Method overloading is the example of compile time polymorphism.	
//Method overriding is the example of run time polymorphism.
	
//5)In java, method overloading can't be performed by changing return type of the method only. 
//Return type can be same or different in method overloading. But you must have to change the parameter.	
//Return type must be same or covariant in method overriding.


