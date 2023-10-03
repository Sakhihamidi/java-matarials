package tek.week_8.practice;

public class Constructor {
	
	// constractor is a block of code --> initialization  to our object
	//default constructor --> created by compiler in backgroun
	// Name of constructor is same as class Name
	//PArametarized constructor --? by develper - user
	
	
	public int num1;
	public String firstName;
	public boolean result;
	
	public Constructor() { // Non parametrized constructor
		num1 = 0;
		firstName = null;
		result = false;
	}
	
	// parameterized constructor
	
	public Constructor(int num1, String firstName, Boolean result) {
		
	}
	public void printFeilds() {
		System.out.println(num1 + firstName + result);
	}
	
	//in runner clas --> objName.printFeild();

}
