package tek.week_6.day_1;

public class Math1Runner {

	// In your main method, create the object of this class and then call
	// the second method to print the result of the calculation.

	public static void main(String[] args) {
		// it is not a good practice to force user to initialize in this way. 
		//the good practice is to have initialize in our method or constractor
		Math1 math1Obj = new Math1();
		math1Obj.num1 = 10;
		math1Obj.num2 = 50;
		math1Obj.printCalculation();
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		math1Obj.num1 = 15;
		math1Obj.num2 = 60;

		math1Obj.printCalculation();

		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		math1Obj.num1 = 2;
		math1Obj.num2 = 3;

		math1Obj.printCalculation();
		

	}

}
