package practice.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList5 {
	
	//in ArrayList when you delet a value all othe value will change their memory place
	// in ArrayList you will have some empty index anyway means all other calue will transfer to prvious indexes
	// and it will creat problem while you have lost of data stored in ArrayList
	
	// linkedList is called doublyLiknedList where its nodes have it next and previus reffrences
	
	/*
	 * LinkedList is a part of Java's collection framework (java.util package) 
	 * and represents a doubly-linked list. In a linked list, 
	 * each element (known as a node) contains two pieces of information: 
	 * the data and a reference to the next (and in the case of a doubly-linked list, the previous) node in the
	 * sequence.
	 */
	
	// Key features of the linked list:
	
	/* 1.
	 * Node-Based Structure: Unlike arrays or ArrayList, which use a 
	 * contiguous block of memory, a LinkedList is composed of individual
	 * nodes. 
	 * Each node contains the data and references to the next 
	 * and previous nodes.
	 * 
	 * 2. 
	 * Doubly-Linked: Java's LinkedList is a doubly-linked list,
	 * which means that each node has a reference to both its next 
	 * node and its previous node. This allows for bidirectional
	 *  traversal.
	 *  
	 *  3.
	 *  Dynamic Size: LinkedList can grow or shrink in size
	 *  dynamically as elements are added or removed.
	 */
	
	

}


//import java.util.ArrayList;
//import java.util.LinkedList;

class LinkedListActivity {
	
		public static void main(String[] args) {
			
			// Create instance of the LinkedList
			LinkedList<Integer> numbers = new LinkedList<>();
			// add some values to the LinkedList

			numbers.add(10);
			numbers.add(30);
			numbers.add(40);
			
			// Remove some values from the LinkedList
			numbers.remove(1); // will remover index 1
			numbers.remove(); // will remove the firs Element /index 0
			
			// print the values from the LinkedList 
			System.out.println(numbers);
			
			ArrayList<Integer> arrNumbers = new ArrayList<>();
			arrNumbers.add(10);
			arrNumbers.add(30);
			arrNumbers.add(40);
			
			System.out.println(arrNumbers);
			
		}
	}


class activityLinkedList {
	
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


class ActivityLinkedListTwo {
	// Write a loop that is going to add values from 10 to 20
		// in a LinkedList. 
		
		// print the values after they've added to the LinkedList.
		
		public static void main(String[] args) {
			LinkedList<Integer> linkedList = new LinkedList<>();

			for (int number = 10; number <= 20; number++) {
				linkedList.add(number);
			}
			
			System.out.println(linkedList);
			
			// give me odd numbers from the linked list?
			
			for (int index = 0; index < linkedList.size(); index++) {
				if (linkedList.get(index) % 2 != 0) {
					System.out.println(linkedList.get(index));
				}
			}			
		}
	}



class AcitivtyThreeLinkedList {
	
	public static void main(String[] args) {
		
		String[] names = {"Bob", "Nancy", "Mike", "Trevor"};
		LinkedList<String> listNames = new LinkedList<>();
		
		// Write a java program that is going to take the values from the 
		// array and add them into a linkedList?
		// print the values from the LinkedList.
		
		// print the values from the array first.
		
		// then, instead of printing the values, try to add them to the
		// LinkedList!
		
		for (String name : names) {
			listNames.add(name);
		}
		
		System.out.println(listNames);
		
		// if you want to target the indexes and do it by indes number
		
		for (int index = 0; index < names.length; index++) {
			listNames.add(names[index]);
		}
		
		System.out.println(listNames);
		
		
	}

}

