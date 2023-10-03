package tek.week_2.day_3;

public class Activity4 {
	/*
	 * applePrice = 1.99; appleQty = 1356.89;
	 * 
	 * orangePrice = 0.99; orangeQty = 87231.89;
	 * 
	 * find out how much to pay total ;
	 */
	public static void main(String[] args) {
		double applePrice = 1.99;
		double appleQty = 1356.89;
		double orangePrice = 0.99;
		double orangeQty = 87231.89;
		
		double totalPrice = 0; 
		
		double appleTotal = applePrice * appleQty; 
		totalPrice += appleTotal; 
		
		double orangeTotal = orangePrice * orangeQty; 
		totalPrice += orangeTotal; 
		
		System.out.println("Total price is " + totalPrice + " USD");
		
	}
}
