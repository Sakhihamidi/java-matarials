package practice.collections;

import java.util.TreeSet;

public class TreeSet10 {
	
	
	/*
	 * TreeSet is another Java class that implements the Set interface. 
	 * Unlike HashSet and LinkedHashSet,which are backed by hash tables,
	 *  TreeSet is backed  by a red-black tree 
	 *  (a type of self-balancing binary search tree).
	 *   As a result, the elements in a TreeSet are 
	 *   always in a sorted order.
	 */
	
	// Key features
	
	/*
	 * Sorted: Elements in a TreeSet are sorted. This can be based on their natural
	 * ordering or using a custom comparator.
	 * 
	 * No Duplicate Values: Like other Set implementations, TreeSet doesn't allow
	 * duplicate values.
	 * 
	 * Null Values: TreeSet does not allow null values. Adding null will throw a
	 * NullPointerException.
	 */
public static void main(String[] args) {
		
		TreeSet<Character> alphabets = new TreeSet<>();
		alphabets.add('a');
		alphabets.add('e');
		alphabets.add('z');
		alphabets.add('b');
		alphabets.add('f');
		alphabets.add('d');
		alphabets.add('c');
		
		// TreeSet is in Alphabetical order see the add method and print
		System.out.println(alphabets);
		
		TreeSet<Integer> numbers = new TreeSet<>();// you can add values to a TreeSeat by using for lopp
		
		for (int i = 10; i >= 0; i--) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
	}

}
