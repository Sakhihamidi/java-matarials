package tek.week_3.review;

import java.util.Scanner;

public class Activity4 {

		// Ask user for hourly pay rate
		// Ask user for weekly work hours.
	
		// calculate gross pay
		// calculate tax. requirement
		// gross <= 1000 -> 5%
	
		// gross >1000 gross < 4000 -> 15%
	
		// gross is more >4000 tax -> 20%
		// print gross payment
		// print tax amount
		// print net payment
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Hourly Pay Rate ?");
			double payRate = scanner.nextDouble(); 
			System.out.println("Enter Weekly Work Hour?");
			double weeklyWorkHour  = scanner.nextDouble(); 
			//Calculation. 
			
			double gross = payRate * weeklyWorkHour; 
			
			double taxRatePercent = 0; 
			if (gross <= 0 ) {
				System.out.println("Gross payment negative tax rate 0");
			}else {
				if(gross <= 1000) {
					taxRatePercent = 5; 
				}else if (gross >1000 && gross <= 4000) {
					taxRatePercent = 15;
				}else {
					taxRatePercent = 20; 
				}
			}
			
			double taxable = (gross * taxRatePercent) / 100; 
			double netPayment = gross - taxable; 
			System.out.println("Gross Payment $ " + gross);
			System.out.println("Taxable with rate " + taxRatePercent + "% $ " + taxable);
			System.out.println("Net Payment $ " + netPayment);
				
	}

}
