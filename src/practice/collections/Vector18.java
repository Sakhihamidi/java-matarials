package practice.collections;

import java.util.Stack;
import java.util.Vector;

public class Vector18 {

	// Same as ArrayList
	/*
	 * Vector is a legacy class in Java that's part of the Java Collections
	 * Framework (JCF). It's similar to ArrayList in many ways, as both are
	 * implementations of the List interface and provide dynamically resizable
	 * arrays. However, there are some important differences.
	 */

	/*
	 * Synchronized: One of the most significant distinctions is that Vector methods
	 * are synchronized. This means that they are thread-safe, and multiple threads
	 * can safely access a Vector without external synchronization. In contrast,
	 * ArrayList methods are not synchronized.
	 * 
	 * Capacity Increment: If a Vector instance's size exceeds its capacity, it
	 * increases its array size by the capacityIncrement (an instance variable). If
	 * capacityIncrement is not set (i.e., zero), the array's size is doubled.
	 * ArrayList, on the other hand, grows by 50% of its current size when element
	 * exceed its capacity.
	 * 
	 * Performance: Because Vector is synchronized, it can be slower than ArrayList
	 * when synchronization is not needed.
	 * 
	 */

	public static void main(String[] args) {

		Vector<String> names = new Vector<>();
		names.add("Bob");
		names.add("Mike");
		names.add("Alex");
		names.add("Eric");

		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		names.remove("Mike");
		System.out.println(names);

		Stack<String> stackNames = new Stack();
		stackNames.add("Bob");
		stackNames.add("Mike");
		stackNames.add("Alex");
		stackNames.add("Eric");

		System.out.println(stackNames);
		stackNames.remove(0);
		System.out.println(stackNames);
		stackNames.remove("Mike");
		System.out.println(stackNames);

		Stack<Integer> stackNumber = new Stack();

		stackNumber.add(10);
		stackNumber.add(20);
		stackNumber.add(30);

		System.out.println(stackNumber);
		stackNumber.remove(0);
		System.out.println(stackNumber);
		stackNumber.remove(0);
		stackNumber.remove(20);
		System.out.println("Size of Stack: " + stackNumber.size());
		System.out.println(stackNumber);

	}

}
