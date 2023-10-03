package tek.week_4.day_1;

public class WhileLoop {

	public static void main(String[] args) {
		//write a java program to store 10 numbers.
		//print the values stored in the array using the while loop.
		
				
		int [] numbers = {10,22,33,44,55,66,77,88,99,100};
		int index =0;

		while (index < numbers.length) {
		
		System.out.println("The Value Stored at index:" + index +" is "+ numbers[index]);
		index++;
	
		}
	}

}
