package tek.week_6.day_1;

public class Activity1 {
	
		
// In your main method, create the object of this class and then call
// the second method to print the result of the calculation.
		
		public static void main(String[] args) {
			Math mathObj = new Math(0, 0);
			mathObj.num1 = 10;
			mathObj.num2 = 50;
			mathObj.printCalculation();

			Math mathObj1 = new Math(40, 50);
			mathObj1.printCalculation();
			
			
			Math mathObj2 = new Math(20,30);
			mathObj2.printCalculation();
		}
		

}
