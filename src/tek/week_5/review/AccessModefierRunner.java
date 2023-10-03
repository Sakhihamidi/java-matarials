package tek.week_5.review;

public class AccessModefierRunner {
	
public static void main(String[] args) {
		
		//how to access methods from class "AccessModifiers"? 
		//1. Create object of class "AccessModifiers"
		
		AccessMedifier access = new AccessMedifier(); 
		
		//2. Call the methods using reference of the created object
		
		access.addition(0, 0);	
//access.modulus(0,0); // this is a private method only accessible in one class
		access.multiplication(0, 0);
		access.division(0, 0);
		
		//3. Input the required values in the fields (if required)
		access.addition(20, 20);
		//access.modulus(0,0); // this is a private method only accessible in one class
		access.multiplication(20, 20);
		access.division(10,2);
		
		
		//Accessing the variables
		
		access.publicVariable = 400;
		//access.privateVariable = 300; // this is private variable can be only access from one certain class 
		access.protectedVariable = 200;
		access.defaultVariable = 100; 

	}
}
