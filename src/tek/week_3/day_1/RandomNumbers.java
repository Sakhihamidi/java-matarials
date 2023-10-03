package tek.week_3.day_1;

public class RandomNumbers {

	public static void main(String[] args) {

		// Get a random number between 0 - 20;
		// 1) Math.random() return a number between 0 - 1
		
		
		double random = Math.random();
		int casted = (int) (random * 20);
		System.out.println(casted);

	}
}