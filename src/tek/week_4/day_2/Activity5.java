package tek.week_4.day_2;

public class Activity5 {

	public static void main(String[] args) {
		// Print the Even values from 0 to 20
		// do not exclude 20 as well including the 20
		
		
		int numbers = 0;
		
		while ( numbers <= 20){
			if (numbers % 2 == 0) {
				System.out.println("Even Numbers:" + numbers);
			}else {
				System.out.println("Odd Numbers" + numbers);
			}
			numbers++;
		}
	}

}
