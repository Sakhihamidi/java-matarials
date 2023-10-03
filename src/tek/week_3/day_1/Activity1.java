package tek.week_3.day_1;

public class Activity1 {

	public static void main(String[] args) {
				//Substring below value based on the requirement 0710202350010 
				//specified below
				//Date 8 character  07102023
				//Amount 3 character  500
				//quantity 2 character  10
				String reportLine = "0710202350010";
				String date = reportLine.substring(0 , 8);
				String amount = reportLine.substring(8 , 11);
				String quantity = reportLine.substring(11);
				System.out.println(date);
				System.out.println(amount);
				System.out.println(quantity);
				
				
				
		
		

	}

}
