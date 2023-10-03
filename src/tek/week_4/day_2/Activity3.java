package tek.week_4.day_2;

public class Activity3 {

	public static void main(String[] args) {
		/*find the Minimum and Maximum number
		 * find the sum of all numbers
		 * fine the average of all numbers 
		 */
		int[] numbers = { 65, 11, 12, 13, 14, 15, 16, 17, 98, 19, 20 };
		int min = numbers[0];
		int max = numbers[0];
		int index = 0;
		int sum = 0;
		double avg = 0;
		
		// if we have one line of code we can remove brackets from if

		while (index < numbers.length) {
			
			sum+= numbers[index];
			
			if (numbers[index] < min)
				min = numbers[index];

			if (numbers[index] > max)
				max = numbers[index];

			index++;
		}
			avg = sum/numbers.length;
			
			System.out.println("The Minimum Value is: " + min);
			System.out.println("The Maximum Value is: " + max);
			System.out.println("The Sum of All Value is: " + sum);
			System.out.println("The Average of All Value is: " + avg);



		}
	}


