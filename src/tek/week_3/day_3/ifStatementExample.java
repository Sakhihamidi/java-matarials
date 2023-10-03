package tek.week_3.day_3;

public class ifStatementExample {
	
	public static void main(String[] args) {

		double price = 2.34;
		double quantity = 40;

		double total = price * quantity;

		// if total more than 200 add 6% tax
		// otherwise add 2% tax.
		double payableTotal = 0; 
		if (total > 200) {
			double tax = (total * 6) / 100;
			payableTotal = total + tax;
		} else {
			double tax = (total * 2) / 100;
			payableTotal = total + tax;
		}
		System.out.println("Payable Amount " + payableTotal);
	}

}