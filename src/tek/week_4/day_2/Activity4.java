package tek.week_4.day_2;

import java.util.Random;

public class Activity4 {

	public static void main(String[] args) {
		/*
		 * find the Minimum and Maximum number find the sum of all numbers find the
		 * average of all numbers use the random function to generate the numbers for
		 * you.
		 * 
		 */
		    Random random = new Random();
		    int[] numbers = new int[10];
		    int numberCount = 0;
		    //for (numberCount = 0; numberCount<numbers.length; numberCount++)
		   // System.out.println(numbers[numberCount]);
	    
		    
		    while (numberCount < numbers.length) {
		        numbers[numberCount] = random.nextInt(10);
		        numberCount++;
		    }
		    int index2 = 0;
		    while (index2 < numbers.length) {
		        System.out.println(numbers[index2]);
		        index2++;
		    }
		    int min = numbers[0];
		    int max = numbers[0];
		    int sum = 0;
		    int count = numbers.length;
		    double avg = 0;
		    int index = 0;

		    while ( index < count) {
		        sum += numbers[index];
		        if (numbers[index] < min)
		            min = numbers[index];
		        if (numbers[index] > max)
		            max = numbers[index];
		        index ++;
		    }

		    avg = sum / numbers.length;

		   System.out.println("The Minimum Value is: " + min);
		   System.out.println("The Maximum Value is: " + max);
		   System.out.println("The Sum of All Value is: " + sum);
		   System.out.println("The Average of All Value is: " + avg);
		}
}
