package tek.week_9.day_2;

import java.util.LinkedList;

public class activityLinkedList {
	
	/*
	 * Initialization: 
	 * Create an empty LinkedList of integers.
	 * Check for its size to
	 * 	confirm it's 0.
	 * 
	 * Insertion: Insert the numbers 10, 20, and 30 sequentially into the list.
	 * Print the list to confirm the order of elements.
	 * 
	 * Deletion: Remove the number 20 from the list. 
	 * Print the list to confirm the removal.
	 * 
	 * -> 10 - 30
	 */
	
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		System.err.println(numbers.size());
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.remove(1);
		System.out.println(numbers);
		
//		for (int number : numbers) {
//			System.out.println(number);
//		}
		
		// inf you want to print the value with their index number
		for (int index = 0; index < numbers.size(); index++) {
			System.out.println(index + ": " + numbers.get(index));
		}
		
		numbers.add(0, 50); // will replace the value of an inex
		numbers.add(50);
		numbers.add(80);
		numbers.add(90);
		
		for (int index = 0; index < numbers.size(); index++) {
			System.out.println(index + ": " + numbers.get(index));
		}
		
	}
}
