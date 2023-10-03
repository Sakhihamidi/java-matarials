package tek.week_5.day_2;


//Instance Variables 

//Instance variables are those variables which is declared inside of the 
//class but outside of the method, constructor or any block. Instane variables
//are also called class scope variables they are also called Fields.

//Instance variables have some characterstics:

//1. The will be created when the object of the class is created. 

//2. Instance variables have default values, for the numbers it is 0
//for the reference it is null and for the boolean is is false. 
// Reference variable means Sting 

//3. The scope of instance variables are within the class -> and since
//inside of the class we have different methods or no methods at all
//still you can access the Instance variables. 

public class InstanceVariable { // Start of the class Block
	
	static String InsVariable;
	// Static means that compiler can access this variable or value 
	// without creating it's object why? because it belongs to main method.
	public static void main(String[] args) {
		System.out.println(InsVariable);
	}
	
} // End of the class Block	
	
	
