package tek.week_9.day_3;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetActivity2 {

		/*
		 * LinkedHashSet is a subclass of HashSet that also implements the Set
		 * interface. What makes LinkedHashSet distinct from HashSet is that it
		 * maintains the order in which elements are inserted into the set 
		 * (insertionorder). Internally, it combines the hash 
		 * table structure from HashSet with a linked list to maintain this order.
		 */
		
		//  No Duplicate Values: Like HashSet, LinkedHashSet 
		//  doesn't allow duplicate values.
		
		// Ordered: Unlike HashSet, which is unordered, LinkedHashSet 
		// maintains the order of elements based on their insertion. 
		// So the iteration order is predictable.
		

		/* Null Values: LinkedHashSet allows one null value. */
		
		public static void main(String[] args) {
			
			LinkedHashSet<String> names = new LinkedHashSet<>();
			names.add("Bob");
			names.add("Trevor");
			names.add("Mike");
			names.add("Tony");
			names.add("Lydia");
			names.add(null);
			names.add(null);
			
			System.out.println(names);
			
			HashSet<String> hashNames = new HashSet<>();
			
			hashNames.add("Bob");
			hashNames.add("Trevor");
			hashNames.add("Mike");
			hashNames.add("Tony");
			hashNames.add("Lydia");
			hashNames.add(null);
			hashNames.add(null);
			
			System.err.println(hashNames);
		}

}
