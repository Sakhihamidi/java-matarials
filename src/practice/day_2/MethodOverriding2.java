package practice.day_2;

public class MethodOverriding2 {
	  public static void main(String args[]){  
		  Bike obj = new Bike();  
		  //calling the method with child class instance  
		  obj.run();
	  }

}

class Vehicle{  //Parent Class
	  void run(){
		  System.out.println("Vehicle is running");
		  }  
	}  

	//Creating a child class 

class Bike extends Vehicle{  
	    
	  }  // what is the problem here?   void run(){System.out.println("Bike is running safely");}  





	