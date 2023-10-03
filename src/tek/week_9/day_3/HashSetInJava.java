package tek.week_9.day_3;

import java.util.*;
public class HashSetInJava {
		
		/*
		 * HashSet is one of the most commonly used classes that implements the 
		 * Set interface. It uses a hash table to store elements, which enables
		 * constant-time performance for basic operations, 
		 * assuming the hash function disperses elements properly among the buckets.
		 * it will not save in memory as array and it will save as hash concept
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
			
			names.remove("Lydia");
			
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
