package practice.collections;

import java.util.ArrayList;

public class ArrayList2 {
	
		// In Java, ArrayList is one of the most widely used classes from.
			// the Collections framework. It provides a dynamic array, 
			// which means you can add or remove items from it after it's been created.
			
			/*
			 * Benifits of using ArrayList:
			 * 1.Dynamic Sizing: Unlike a traditional array, an ArrayList automatically
			 * resizes itself when you add or remove elements.
			 *  
			 * 2.Implements List Interface: ArrayList implements the List interface, 
			 * so it's ordered and elements can be accessed by their index position. 
			 * 
			 * 3.Allows Duplicates: You can store duplicate values in an ArrayList.
			 * 4.Allows null: ArrayList can have null values. 
			 * 5.Initial Capacity: When created, an ArrayList has an initial capacity. 
			 * If the elements exceed this capacity, the array is resized 
			 * (typically it's 150%).
			 * 6.Iterable: ArrayList implements the Iterable interface, so you can iterate
			 * over its elements using enhanced for-loops or iterators meand other loops.
			 */
			
	
	// in all colllections we should use reffrence datatypes
	// in order to find the size of the array list 150% 
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(); 
		
		names.add("Bob");
		names.add("Erin");
		names.add("Mike");
		names.add("Trevor");
		names.add("1");
		names.add("");
		names.add(null);
		//names.clear();  will remove all values from our list

		names.add(0, "New Name"); // will add "New Name" in index 0
		
		System.out.println(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// Create an ArrayList of numbers and add some values to it.
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		numbers.add(80);
		numbers.add(90);
		numbers.add(100);
		numbers.add(120);
		numbers.add(10);
		System.out.println(numbers);
		// .size() is like .length();
//		for (int index = 0; index < numbers.size(); index++) {
//			System.out.println(numbers.get(index));
//		}
//		
//		System.err.println(numbers.size()); // will print the size of our arraylist
		System.out.println(numbers.remove(11)); // will remove the value on idex 11
		// remove an index from the arrayList using it's index number.
		numbers.remove(1);
		System.out.println(numbers);
		
	
	}
}
