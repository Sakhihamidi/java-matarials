package practice.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet8 {
	/*
	 * HashSet is one of the most commonly used classes that implements the 
	 * Set interface. It uses a hash table to store elements, which enables
	 * constant-time performance for basic operations, 
	 * assuming the hash function disperses elements properly among the buckets.
	 */
	// Some key features of the HashSet
	/*
	 * 1. No Duplicate Values: If you try to add a duplicate value, 
	 * the HashSet will not store the duplicate and the add 
	 * method will return false.
	 * 
	 * 2. Unordered: The order of elements in a HashSet is not guaranteed. 
	 *    It might change over time.
	 *    
	 *  3.Null Values: HashSet allows one null value. 
	 */
	
	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<>();
		
		names.add("Bob");
		names.add("Trevor");
		names.add("Mike");
		names.add("Tony");
		names.add("Lydia");
		names.add(null);
		names.add(null);
		
		System.out.println(names);
		
		names.remove("Lydia");// remove a value
		names.remove(1);// remove one index

		names.retainAll(names); // will remove all values from our hashlist
		
// No duplicate Value for Hashset but there is duplicate values for linkedList and Arraylist
// will return false or true if the value is exist or nor in our Hashset
		System.out.println(names.contains("Tony")); 

		System.out.println(names);
		
		ArrayList<String> arrayListNumbers = new ArrayList<>();
		arrayListNumbers.add("Bob");
		arrayListNumbers.add("Trevor");
		arrayListNumbers.add("Mike");
		arrayListNumbers.add("Tony");
		arrayListNumbers.add(null);
		arrayListNumbers.add(null);
		arrayListNumbers.add(null);
		
		System.out.println(arrayListNumbers);
		
	}

}

// how to find unique Values from an integer
// the best way is to use hashset
class HashSetActivity {
	
	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,2,3,4,5,6,7,8,9,10,1,10,10,10,200,200};
		HashSet<Integer> values = new HashSet<>();
		
		for (int number : numbers) {
			values.add(number);
		}
		
		System.out.println(values);
// you can also use for loop
		for (int index = 0; index < numbers.length; index++) {
			values.add(numbers[index]);
		}
		
		System.err.println(values);
		
	}
}
